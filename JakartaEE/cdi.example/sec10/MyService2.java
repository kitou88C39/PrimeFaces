package JakartaEE.cdi.example.sec10;

import jakarta.enterprise.inject.Decorator;
import jakarta.enterprise.inject.delegate.Delegate;
import jakarta.inject.Inject;

@Decorator
public class MyService2 implements MyService {

    @inject
    @Delegate
    public String getMessage() {
        return "Hello from MyService2";
    }
}
