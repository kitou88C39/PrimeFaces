package JakartaEE.cdi.example.sec07;

import jakarta.enterprise.inject.Dependnt;

@Dependnt
public class MyService1 implements MyService {
    private int count = 0;

    public void countUp() {
        this.count++;
    }

    @Override
    public String getMessage() {
        return "Hello MyService1 count=" + this.count;
    }
}
