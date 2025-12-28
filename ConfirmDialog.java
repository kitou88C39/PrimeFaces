
@ManagedBean(name = "dm")
public class ConfirmDialog {

    public void confirm() {
        addMessage("Delete record", "Record has been deleted");
    }

    public void addMessage(String summary, String detail) {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, summary, detail);
        FaceContext.getCurrentInstance().addMessage(null, message);
    }
}
