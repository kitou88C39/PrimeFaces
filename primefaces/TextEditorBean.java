@ManagedBean(name = "te")
@RequestScoped
public class TextEditorBean {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
