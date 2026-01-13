package JakartaEE.interceptor.example.sec05;

import jakarta.inject.Inject;

public class CDIApp {
    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec05");
        this.myService.sayHello("MyService");
    }
}
