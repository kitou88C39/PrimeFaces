package JakartaEE.interceptor.example.sec04;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MyBinding
@Interceptor
@Priority(Intercepter.Priority.APPLICATION + 1)
public class MyInterceptor1 {
    @AroundInvoke
    public Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor1 - before proceed");
        Object result = context.proceed();
        System.out.println("MyInterceptor1 - after proceed");
        return result;
    }
}
