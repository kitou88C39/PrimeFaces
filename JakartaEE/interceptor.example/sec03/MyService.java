package JakartaEE.interceptor.example.sec03;

import jakarta.annotation.Priority;

@MyBinding
public class MyService {
    public String sayHello(String name) {
        System.out.println("Hello" + name + "!");
    }
}
