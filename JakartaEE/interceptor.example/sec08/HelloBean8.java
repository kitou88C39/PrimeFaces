package JakartaEE.interceptor.example.sec08;

import jakarta.ejb.Stateless;
import jakarta.ejb.EJB;
import ui.HelloBean;
import jakarta.interceptor.Interceptors;

@Stateless()
@MyInterceptors({ MyInterceptor.class })
public class HelloBean8 {
    @EJB
    private HelloBean hellobean;

    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
        this.hellobean.sayHello("Enterprise Beans");
    }
}
