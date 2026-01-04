package JakartaEE.cdi.example.seco1;

import jakarta.enterprise.context.Dependent;

@Dependent
public class CDIApp {

    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp");
        System.out.println(this.myService.getMessage());
    }
}
