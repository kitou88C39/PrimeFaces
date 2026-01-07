package JakartaEE.cdi.example.sec05;

import jakarta.inject.Inject;
import jakarta.inject.Named;

public class CDIApp {
    @Inject
    @Default
    @MyQualifier1
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec05");
        System.out.println(this.myService.getMessage());
    }
}
