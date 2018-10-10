import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlInputText;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@SessionScoped
public class Collection {

    private List<Student> listUser = new ArrayList<Student>();

    public Collection() {
        Student s1 = new Student("ghazouan","badr","bghazouan9@gmail.com");
        Student s2 = new Student("kadim","omar","omarkadim@gmail.com");
        Student s3 = new Student("badr","hamza","hamza@gmail.com");
        Student s4 = new Student("Adria","b&t","adria@gmail.cim" );
        listUser.add(s1);
        listUser.add(s2);
        listUser.add(s3);
        listUser.add(s4);
        listUser.add(new Student());

    }

    public Collection(List<Student> listUser) {
        this.listUser = listUser;
    }

    public List<Student> getListUser() {
        return listUser;
    }

    public void setListUser(List<Student> listUser) {
        this.listUser = listUser;
    }

    public void editableStudent(Student student) {
        if(student.getNom() == null)
            listUser.add(new Student());

        student.setEditable(!student.isEditable());
    }

    public void saveEditable(Student s) {

        if(s.isEditable() == true) {

            if (s.getNom() != "" && s.getPrenom() !="" && s.getEmail()!="")
                editableStudent(s);
            else
                listUser.remove(s);
        }
    }

    public void deleteEditable(Student student) {
        if(student.getNom() != null && student.getPrenom() != null && student.getEmail() != null )
            listUser.remove(student);
    }

}
