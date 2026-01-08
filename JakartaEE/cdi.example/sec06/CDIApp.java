package JakartaEE.cdi.example.sec06;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class CDIApp {
    @Inject
    @Default
    // @MyQualifier1
    private Set<MyService> myService;

    public void run() {
        System.out.println("Hello CDIApp sec06");
        System.out.println(this.myService.getMessage());
        this.myService.forEach(service -> System.out.println(service.getMessage()));
    }
}
