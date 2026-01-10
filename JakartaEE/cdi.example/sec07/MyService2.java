package JakartaEE.cdi.example.sec07;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyService2 implements MyService {
    private int count = 0;

    public void countUp() {
        this.count++;
    }

    @Override
    public String getMessage() {
        return "Hello MyService2 count=" + this.count;
    }
}
