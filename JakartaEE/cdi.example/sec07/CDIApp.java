package JakartaEE.cdi.example.sec07;

import jakarta.inject.Inject;

public class CDIApp {
    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec07");
        System.out.println(this.myService.getMessage());
    }
}
