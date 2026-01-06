package JakartaEE.cdi.example.sec04;

@MyQualifier1
@Named
public class MyService2 implements MyService1 MyService{

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
