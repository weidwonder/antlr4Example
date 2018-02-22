import java.util.HashMap;
import java.util.Map;

public class ExpressionEnv {
    private Map<String, Object> attrs = new HashMap<>();

    public void setAttrs(Map<String, Object> attrs) {
        this.attrs = attrs;
    }

    public String get(String name) {
        Object rtn = attrs.getOrDefault(name, null);
        if (rtn == null) {
            return null;
        } else {
            return rtn.toString();
        }
    }

}
