package JakartaEE.interceptor.example.sec09;

import jakarta.ejb.Stateless;
import jakarta.ejb.EJB;
import ui.HelloBean;
import jakarta.interceptor.Interceptors;

@Stateless()
@Interceptors({ MyInterceptor.class })
public class HelloBean9 {
    @EJB
    private HelloBean hellobean;

    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
        this.hellobean.sayHello("@EJB");
    }

    public void sayHello(Timer timer) {
        System.out.println("Timeout9 method executed");

}
