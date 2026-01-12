package JakartaEE.interceptor.example.sec02;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
public class MyService1 {
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor - Before method invocation");
        Object result = context.proceed();
        System.out.println("MyInterceptor - After method invocation");
        return result;
    }
}
