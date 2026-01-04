@ManagedBean(name = "pc")
@ViewScoped
public class PollCounter {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }
}
