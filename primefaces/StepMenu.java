@ManagedBean(name = "mb")
public class StepMenu {

    public void address() {
        addMessage("Address", "Address clicked");
    }

    public void product() {
        addMessage("Product", "Product clicked");
    }

    public void payment() {
        addMessage("Payment", "Payment clicked");
    }

    public void addMessage(String summary, String detail) {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, summary, detail);
        FaceContext.getCurrentInstance().addMessage(null, message);
    }
}
