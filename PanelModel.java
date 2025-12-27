@ManagedBean(name = "nb")
public class PanelModel {

    public void file() {
        addMessage("File", "File Clicked");
    }

    public void edit() {
        addMessage("Edit", "Edit Clicked");
    }

    public void view() {
        addMessage("View", "View Clicked");
    }

    public void addMessage(String summary, String dtail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY, summary, detail);
        FaceContext.getCurrentInstance().addMessage(null, message);

    }
}
