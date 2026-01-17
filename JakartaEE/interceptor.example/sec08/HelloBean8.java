package JakartaEE.interceptor.example.sec08;

import jakarta.ejb.Stateless;
import jakarta.ejb.EJB;
import ui.HelloBean;

@Stateless()
public class HelloBean8 {
    @EJB
    private HelloBean hellobean;

    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
