package JakartaEE.interceptor.example.sec06;

import jakarta.interceptor.Interceptors;

@Interceptors(MyInterceptor.class)
public class MyService {
    public String sayHello(String name) {
        System.out.println("Hello" + name + "!");
    }

    public String sayHello(String name) {
        System.out.println("Hello" + name + "!");
    }
}
