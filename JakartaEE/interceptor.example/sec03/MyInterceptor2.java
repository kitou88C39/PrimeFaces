package JakartaEE.interceptor.example.sec03;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MyBinding
@Interceptor
@Priority(Intercepter.Priority.APPLICATION + 2)
public class MyService2 {
    @AroundInvoke
    public Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor2 - before proceed");
        Object result = context.proceed();
        System.out.println("MyInterceptor2 - after proceed");
        return result;
    }
}
