package JakartaEE.cdi.example.sec05;

import jakarta.annotation.Priority;
import jakarta.enterprise.inject.Alternative;

@Alertnative
@Priority(1)
public class MyService3 implements MyService {

    @Override
    public String getMessage() {
        return "Hello from MyService3";
    }
}
