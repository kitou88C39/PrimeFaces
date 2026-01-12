package JakartaEE.interceptor.example.sec01;

public class MyInterceptor {
    @AroundInvoke
    public Object intercept(InvocationContext context) throws Exception {
        System.out.println("MyInterceptor - Before method invocation");
        Object result = context.proceed();
        System.out.println("MyInterceptor - After method invocation");
        return result;
    }
}
