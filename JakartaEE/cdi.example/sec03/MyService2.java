package JakartaEE.cdi.example.sec03;

public class MyService2 implements MyService1 MyService
{

    @Override
    public String getMessage() {
        return "Hello World";
    }
}