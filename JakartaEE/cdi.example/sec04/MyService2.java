package JakartaEE.cdi.example.sec04;

@Default
@MyQualifier1
public class MyService2 implements MyService1 MyService{

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
