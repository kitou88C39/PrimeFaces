package JakartaEE.cdi.example.sec09;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestory;
import jakarta.inject.Inject;

public class CDIApp {
    @Inject
    private MyService myService1;
    @Inject
    private MyService myService2;
    @Inject
    private MyService myService3;

    public void run() {
        System.out.println("Hello CDIApp sec08");
        System.out.println("this.myService1.getMessage()");
        System.out.println("this.myService2.getMessage()");
        System.out.println("this.myService3.getMessage()");
    }

    @PostConstruct
    public void postConstruct() {
        System.err.println("CDIApp sec08 @PostConstruct");
    }

    @PreDestory
    public void preDestory() {
        System.err.println("CDIApp sec08 @PreDestory");
    }
}
