import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Max;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class User implements Serializable {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String address;
    private String messagevalidation;
    private int age;
    private boolean enabled = false;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMessagevalidation() {
        return messagevalidation;
    }
    public void setMessagevalidation(String messagevalidation) {
        this.messagevalidation = messagevalidation;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void consoleMessageValidation() {
        System.out.println("message = " + messagevalidation);
        enabled = true;
    }
}