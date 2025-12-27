import javax.faces.bean.ManagedBean;

@ManagedBean(name = "editor")
public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
