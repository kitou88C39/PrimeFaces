package JakartaEE.interceptor.example.sec02;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MyBinding
@Interceptor
public class MyInterceptor1 {
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor1 - before invocation");
        Object result = context.proceed();
        System.out.println("MyInterceptor1 - after invocation");
        return result;
    }
}
