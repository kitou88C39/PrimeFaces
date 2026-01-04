@ManagedBean(name = "tab")
public class ToggleSwitchBean {

    private boolean Status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean name) {
        this.status = status;
    }

    public void addMessage() {
        String summary = status ? "Checked" : "Unhecked";
        FaceContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }
}
