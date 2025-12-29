@ManagedBean(name = "mylistener")
public class Mylistener {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void handleEvent() {
        name = name.toUpperCase();
    }
}
