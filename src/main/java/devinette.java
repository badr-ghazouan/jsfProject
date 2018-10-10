import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Random;

@ManagedBean
@SessionScoped
public class devinette implements Serializable {
    public FacesContext ctx ;
    private int nbrlabel=3;
    private boolean enabled;
    private int userInput;
    private String result ="null string now";
    public int n;

    public devinette() {
        ctx = FacesContext.getCurrentInstance();
        Random r = new Random();
        n = r.nextInt(10) + 1;
        System.out.println("random nbr is  : " + n);
    }
    public int getNbrlabel() {
        return nbrlabel;
    }

    public void setNbrlabel(int nbrlabel) {
        this.nbrlabel = nbrlabel;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public int getUserInput() {
        return userInput;
    }
    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public  void devinerNbr() {

        if(userInput == n) {
            result = " well done";
            enabled = true;
        }
        else {
            if(nbrlabel == 0) {
                System.out.println("nbrLabel == 0 ");
                enabled = true;
                ctx.addMessage("userNbr",new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "please enter a correct number","devine the number"));
                result = "you failed";

            }else
                nbrlabel--;
                result = "try again";
        }
    }
}
