package JakartaEE.cdi.example.sec10;

import jakarta.inject.Inject;

public class CDIApp {
    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec10");
        System.out.println(this.myService.getMessage());
    }
}
