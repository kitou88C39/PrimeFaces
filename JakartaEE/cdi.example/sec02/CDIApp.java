package JakartaEE.cdi.example.sec02;

import jakarta.enterprise.context.Dependent;

@Dependent
public class CDIApp {

    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec02");
        System.out.println(this.myService.getMessage());
    }
}