package JakartaEE.interceptor.example.sec05;

import jakarta.interceptor.Interceptors;

@Interceptors(MyInterceptor1.class)
public class MyService {
    @interceptors(MyInterceptor2.class)
    public String sayHello1(String name) {
        System.out.println("Hello1" + name + "!");
    }

}