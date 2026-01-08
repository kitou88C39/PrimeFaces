package JakartaEE.cdi.example.sec06;

@MyQualifier1
public class MyService1 implements MyService {
    private final String message;

    public MyService1() {
        this.message = "Hello World";
    }

    public MyService1(String message) {
        this.message = "Hello World";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}