package JakartaEE.cdi.example.sec02;

@Alternative
public class MyService3 implements MyService {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}