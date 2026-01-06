package JakartaEE.cdi.example.sec03;

import jakarta.enterprise.context.Dependent;

@Dependent
public class CDIApp {

    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec03");
        System.out.println(this.myService.getMessage());
    }
}