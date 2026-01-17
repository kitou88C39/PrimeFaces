package JakartaEE.interceptor.example.sec08;

import jakarta.ejb.EJBContainer;
import jakarta.naming.Context;

public class App {
    public static void main(String[] args) {
        try(EJBContainer ejbContainer = EJBContainer.createEJBContainer()
        Context context = ejbContainer.getContext();
        HelloBean8 hellobean = (HelloBean8)context.lookup("");
        helloBean.sayHello("Enterprise Beans");
    }catch(

    Exception e)
    {
        e.printStackTrace();
    }
}
