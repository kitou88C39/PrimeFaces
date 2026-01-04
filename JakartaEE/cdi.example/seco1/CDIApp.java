package JakartaEE.cdi.example.seco1;

@Dependent
public class CDIApp {

    @Inject
    private MyService myService;

    public void displayMessage() {
        System.out.println(myService.getMessage());
    }
}
