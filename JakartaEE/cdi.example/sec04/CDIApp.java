package JakartaEE.cdi.example.sec04;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class CDIApp {
    @Inject
    @Default
    @MyQualifier1
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec04");
        System.out.println(this.myService.getMessage());
    }
}
