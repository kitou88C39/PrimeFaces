package JakartaEE.interceptor.example.sec08;

import jakarta.ejb.Stateless;

@Stateless()
public class HelloBean8 {
    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
