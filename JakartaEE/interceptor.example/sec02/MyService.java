package JakartaEE.interceptor.example.sec02;

import jakarta.interceptor.Interceptors;

@Interceptors(MyInterceptor1.class, MyInterceptor2.class)
public class MyService {
    public String sayHello(String name) {
        System.out.println("Hello" + name + "!");
    }
}
