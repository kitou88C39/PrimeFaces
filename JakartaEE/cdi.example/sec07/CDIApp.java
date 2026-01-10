package JakartaEE.cdi.example.sec07;

import jakarta.inject.Inject;

public class CDIApp {
    @Inject
    private MyService1 myService11;
    @Inject
    private MyService1 myService12;
    @Inject
    private MyService1 myService13;
    @Inject
    private MyService2 myService21;
    @Inject
    private MyService2 myService22;
    @Inject
    private MyService2 myService23;

    public void run() {
        System.out.println("Hello CDIApp sec07");
        System.out.println(this.myService.getMessage());
    }
}
