import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
@SessionScoped
public class LanguageBean  implements Serializable {

    private static final long serialVersionUID = 1L;

    public Map languageMap = new HashMap();

    public Map getLanguageMap() {
        return languageMap;
    }

    public void setLanguageMap(Map languageMap) {
        this.languageMap = languageMap;
    }
}
