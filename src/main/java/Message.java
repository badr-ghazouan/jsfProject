import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message = "Hello World from Message class!";

    public String getMessage() {
        System.out.println("Message.getMessage  = "  + message);
        return message;

    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "HelloWorld.messageBean = Message.toString";
    }
}