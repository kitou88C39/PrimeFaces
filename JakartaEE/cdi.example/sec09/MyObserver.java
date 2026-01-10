package JakartaEE.cdi.example.sec09;

import jakarta.annotation.Priority;
import jakarta.enterprise.event.Observes;

public class MyObserver {
    public void onEvent1(@Observes @Priority(1) MyEvent event) {
        System.out.println("MyObserver.onEvent1 message " + event.getMessage());
    }

    public void onEvent2(@Observes @Priority(2) MyEvent event) {
        System.out.println("MyObserver.onEvent2 message " + event.getMessage());
    }
}
