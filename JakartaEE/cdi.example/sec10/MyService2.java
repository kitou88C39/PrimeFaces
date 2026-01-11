package JakartaEE.cdi.example.sec10;

import jakarta.enterprise.inject.Decorator;
import jakarta.enterprise.inject.delegate.Delegate;
import jakarta.inject.Inject;

@Decorator
public class MyService2 implements MyService {

    @inject
    @Delegate
    private MyService myService;

    @Override
    public String getMessage() {
        return "@Decorator MyService2: " + this.myService.getMessage() + ;
    }
}