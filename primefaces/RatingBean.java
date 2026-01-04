@ManagedBean(name = "rb")
public class RatingBean {

    private Integer basicRating;
    private Integer callbackRating;
    private Integer ajaxRating;
    private Integer readOnlyRating = 3;

    public void onrate(RateEvent<Integer> rateEvent) {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, "Rate Event",
                "You rated:" + rateEvent.getRating());
        FaceContext.getCurrentInstance().addMessage(null, message);
    }

    public void oncancel() {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, "Cancel Event", "Rating Reset");
        FaceContext.getCurrentInstance().addMessage(null, message);
    }

    public String getBasicRating() {
        return basicRating;
    }

    public void setBasicRating(Integer basicRating) {
        this.basicRating = basicRating;
    }

    public String getCallbackRating() {
        return callbackRating;
    }

    public void setCallbackRating(Integer callbackRating) {
        this.callbackRating = callbackRating;
    }

    public String getAjaxRating() {
        return ajaxRating;
    }

    public void setAjaxRating(Integer ajaxRating) {
        this.ajaxRating = ajaxRating;
    }

    public String getReadOnlyRating() {
        return readOnlyRating;
    }

    public void setReadOnlyRating(Integer readOnlyRating) {
        this.readOnlyRating = readOnlyRating;
    }
}
