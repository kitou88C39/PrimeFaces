package JakartaEE.cdi.example.sec03;

@Named
public class MyService3 implements MyService {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}