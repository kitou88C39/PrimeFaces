@ManagedBean(name = "student")
public class Student {

    private String name;
    private String hobby;

    public void display(){
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Name is " + name + " " + "and hobby is " + hobby));

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
