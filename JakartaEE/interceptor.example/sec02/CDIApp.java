package JakartaEE.interceptor.example.sec02;

import jakarta.inject.Inject;

public class CDIApp {
    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec02");
        this.myService.sayHello("MyService");
    }
}
