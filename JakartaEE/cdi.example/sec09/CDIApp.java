package JakartaEE.cdi.example.sec09;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

public class CDIApp {
    @Inject
    private Event<MyService> event;

    public void run() {
        System.out.println("Hello CDIApp sec09");
        this.event.fire(new MyEvent("My event fired!"));
    }
}
