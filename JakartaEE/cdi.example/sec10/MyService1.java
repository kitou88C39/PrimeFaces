package JakartaEE.cdi.example.sec10;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;

@Alertnative
@Priority(10)
public class MyService1 implements MyService {

    @Override
    public String getMessage() {
        return "Hello MyService1";
    }
}
