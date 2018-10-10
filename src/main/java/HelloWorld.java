import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
public class HelloWorld implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManagedProperty(value = "#{message.message}")
    private String messageBean;

    private String message="default one";

    public HelloWorld() {
        System.out.println("HelloWorld started!");
    }

    public String getMessage() {
        System.out.println("Helloworld.getMessage = " + messageBean);
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageBean() {
        return messageBean + "==> messagebean getter";
    }

    public void setMessageBean(String message) {
        this.messageBean = message;
    }
}