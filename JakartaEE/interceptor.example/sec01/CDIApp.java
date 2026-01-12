package JakartaEE.interceptor.example.sec01;

import jakarta.inject.Inject;

@Singleton
public class CDIApp {
    @Inject
    private MyService myService;

    public void run() {
        System.out.println("Hello CDIApp sec01");
        this.myService.sayHello("MyService");
    }
}
