package JakartaEE.cdi.example.sec08;

import jakarta.util.List;

public class CDIApp {
    @Inject
    private MyService myService1;
    @Inject
    private MyService myService2;
    @Inject
    private MyService myService3;

    public void run() {
        System.out.println("Hello CDIApp sec08");
    }
}
