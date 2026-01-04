@ManagedBean(name = "mb")
public class MenuBar {

    public void file() {
        addMessage("File", "File clicked");
    }

    public void edit() {
        addMessage("Edit", "Edit clicked");
    }

    public void view() {
        addMessage("View", "View clicked");
    }

    public void addMessage(String summary, String detail) {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, summary, detail);
        FaceContext.getCurrentInstance().addMessage(null, message);
    }
}
