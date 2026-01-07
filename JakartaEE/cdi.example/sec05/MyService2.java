package JakartaEE.cdi.example.sec05;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;

@Alertnative
@Priority(10)
public class MyService2 implements MyService {

    @Override
    public String getMessage() {
        return "Hello World";
    }
}
