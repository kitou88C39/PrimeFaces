@ManagedBean(name = "jmb")
public class IdleMonitorBean {

    public void onIdle() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "No activity",
                        "What are you doing over there"));
    }

    public void onActive() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Welcome Back",
                        "Subscribe Ripples Code Channel!"));
    }
}
