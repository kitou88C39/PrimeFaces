package JakartaEE.cdi.example.sec04;

@MyQualifier2
public class MyService3 implements MyService {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}