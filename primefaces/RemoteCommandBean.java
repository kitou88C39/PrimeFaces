@ManagedBean(name = "rcb")
public class RemoteCommandBean {

    public void display() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "called", "Using RemoteCommand."));
    }
}
