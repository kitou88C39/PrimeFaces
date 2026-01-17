package JakartaEE.interceptor.example.sec09;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.AroundTimeout;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
public class MyInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor - Before method invocation");
        Object result = context.proceed();
        System.out.println("MyInterceptor - After method invocation");
        return result;
    }

    @AroundTimeout
    public void AroundConstruct(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor - Before method proceed");
        Object result = context.proceed();
        System.out.println("MyInterceptor - Before method proceed");
        return result;
    }
}
