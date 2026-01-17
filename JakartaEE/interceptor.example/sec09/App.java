package JakartaEE.interceptor.example.sec09;

import jakarta.ejb.EJBContainer;
import jakarta.naming.Context;
import javax.naming.NamingException;

public class App {
    public static void main(String[] args) {
        try(EJBContainer ejbContainer = EJBContainer.createEJBContainer()
        Context context = ejbContainer.getContext();
        HelloBean9 hellobean = (HelloBean9)context.lookup("java:global/classes/HelloBean8!HelloBean9");
        helloBean.sayHello("Enterprise Beans");
        Thread.sleep(10000);
    }catch(NamingException|

    Exception e)
    {
        e.printStackTrace();
    }
}
