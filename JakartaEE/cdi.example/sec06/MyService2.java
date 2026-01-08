package JakartaEE.cdi.example.sec06;

@MyQualifier2
public class MyService2 extends MyService1 {

    @Override
    public String getMessage() {
        return "Hello MyService2";
    }
}