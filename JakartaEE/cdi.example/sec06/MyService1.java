package JakartaEE.cdi.example.sec06;

import jakarta.enterprise.inject.Default;

@Default
@MyQualifier1
public class MyService1 implements MyService MyService{

    @Override
    public String getMessage() {
        return "Hello MyService1";
    }
}