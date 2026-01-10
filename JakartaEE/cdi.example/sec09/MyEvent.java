package JakartaEE.cdi.example.sec09;

public class MyEvent {
    private final String message;

    public MyEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
