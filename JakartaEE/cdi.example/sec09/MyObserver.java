package JakartaEE.cdi.example.sec09;

import jakarta.enterprise.event.Observes;

public class MyObserver {
    public void onEvent1(@Observes MyEvent event) {
        System.out.println("MyObserver.onEvent1 message " + event.getMessage());
    }

    public void onEvent2(@Observes MyEvent event) {
        System.out.println("MyObserver.onEvent2 message " + event.getMessage());
    }
}
