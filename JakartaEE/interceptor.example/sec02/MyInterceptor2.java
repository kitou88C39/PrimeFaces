package JakartaEE.interceptor.example.sec02;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MyBinding
@Interceptor
public class MyInterceptor2 {
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor2 - before proceed");
        Object result = context.proceed();
        System.out.println("MyInterceptor2 - after proceed");
        return result;
    }
}
