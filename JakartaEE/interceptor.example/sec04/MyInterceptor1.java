package JakartaEE.interceptor.example.sec04;

import jakarta.interceptor.*;
import jakarta.annotation.Priority;

@MyBinding
@Interceptor
@Priority(Intercepter.Priority.APPLICATION + 1)
public class MyInterceptor1 {
    @AroundInvoke
    public Object aroundInvoke(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor1 - before proceed");
        String clazz = context.getTarget().getClass().getName();
        String method = context.getMethod().getName();
        System.out.println("¥tclazz=" + clazz + "method=" + method);
        Object result = context.proceed();
        System.out.println("MyInterceptor1 - after proceed");
        return result;
    }
}
