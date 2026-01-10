package JakartaEE.cdi.example.sec08;

public class MyService {
    String getMessage();return"Hello MyService sec08";

    @PostConstruct
    public void postConstruct(){
        System.err.println("MyService sec08 @PostConstruct");
    }

    @PreDestory
    public void preDestory(){
        System.err.println("MyService sec08 @PreDestory");
    }
}
