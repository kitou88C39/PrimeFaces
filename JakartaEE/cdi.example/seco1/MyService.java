package JakartaEE.cdi.example.seco1;

import jakarta.enterprise.context.Dependent;

@Dependent
public class MyService {

    public String getMessage() {
        return "Hello World";
    }
}
