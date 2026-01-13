package JakartaEE.interceptor.example.sec06;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.interceptor.AroundConstruct;

@Interceptor
public class MyInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor - Before method invocation");
        Object result = context.proceed();
        System.out.println("MyInterceptor - After method invocation");
        return result;
    }

    @AroundConstruct
    public void AroundConstruct(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor - Before method proceed");
        context.proceed();
        System.out.println("MyInterceptor - Before method proceed");
    }

    @PostConstruct
    public void postConstruct(InvocationContext context) {
        System.out.println("MyInterceptor - postConstruct()");
    }

    @PreDestroy
    public void preDestroy(InvocationContext context) {
        System.out.println("MyInterceptor - preDestroy()");
    }
}