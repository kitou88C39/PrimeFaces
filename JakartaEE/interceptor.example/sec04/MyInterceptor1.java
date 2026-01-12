package JakartaEE.interceptor.example.sec04;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

@MyBinding
public class MyService {
    public static void main(String[] args) {
        Weld weld = new Weld();
        try (WeldContainer container = weld.initialize()) {
            container.select(CDIApp.class).get().run();
        }
    }
}
