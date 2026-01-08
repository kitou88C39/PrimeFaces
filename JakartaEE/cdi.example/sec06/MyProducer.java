package JakartaEE.cdi.example.sec06;

import jakarta.enterprise.inject.Produces;
import java.util.Set;

public class MyProducer {
    @Produces
    private Set<MyService> getMyServiceSet = Set.of(
            new MyService1("MyService1"),
            new MyService2("MyService2"))
}
