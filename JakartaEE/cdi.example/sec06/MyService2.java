package JakartaEE.cdi.example.sec06;

@MyQualifier2
public class MyService2 extends MyService1 {
    public MyService2() {
        super("Hello MyService2");
    }

    public String getMessage(String message) {
        super(message);
    }
}