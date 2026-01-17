package JakartaEE.interceptor.example.sec09;

import jakarta.ejb.Stateless;
import jakarta.ejb.Schedule;
import jakarta.ejb.Timer;

@Stateless()
public class HelloBean9 {

    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    @Schedule(hour = "*", minute = "*", second = "*/10", persistent = false)
    public void timeout(Timer timer) {
        System.out.println("Timeout9 method executed");

    }
}
