@RequestScoped
@ManagedBean(name = "cp")
public class ColorPickerBean {

    private String inlineColor;
    private String popupColor;

    public String getInlineColor() {
        return inlineColor;
    }

    public void setinlineColor(String inlineColor) {
        this.inlineColor = inlineColor;
    }

    public String getPopupColor() {
        return popupColor;
    }

    public void setPopupColor(String popupColor) {
        this.popupColor = popupColor;
    }
}
