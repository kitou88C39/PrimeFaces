package JakartaEE.cdi.example.sec06;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class App {

    public static void main(String[] args) {
        Weld weld = new Weld();
        try (WeldContainer container = weld.initialize()) {
            container.select(CDIApp.class).get().run();
        }
    }
}
