@ManagedBean(name = "pb")
public class ProcessBean {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void display() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Helll " + firstname + "" + lastname));
    }
}
