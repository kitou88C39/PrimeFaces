@ManagedBean(name = "user")
public class User {

    private String name;

    public int getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
