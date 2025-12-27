@ManagedBean(name = "user")
public class Growl {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return username;
    }

    public void setPassword(String userpassword) {
        this.password = password;
    }

    public void displayMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Loing Successful", "Welcom: " + username));
    }
}
