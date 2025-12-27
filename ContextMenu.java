
@ManagedBean(name = "mb")
public class ContextMenu {

    public MenuModel menuModel;

@PostConstruct
public void init() {

    menuModel = new DefaultMenuModel();
    DefaultMenuModel menuItem = new DefaultMenuModel();
    menuItem.setValue("Home");
    menuItem.setUrl("https://www.");
    menuModel.addElement(menuItem);

    DefaultMenuItem menuItem1 = new DefaultMenuModel();
    menuItem.setValue("JSF");
    menuItem.setUrl("https://www.");
    menuModel.addElement(menuItem);

    DefaultMenuItem menuItem2 = new DefaultMenuModel();
    menuItem.setValue("Prime Faces");
    menuItem.setUrl("https://www.");
    menuModel.addElement(menuItem2);

    DefaultMenuItem menuItem3 = new DefaultMenuModel();
    menuItem.setValue("JavaFx");
    menuItem.setUrl("https://www.");
    menuModel.addElement(menuItem);

    public MenuModel getMenuModel() {
        return menuModel;
    }

    public void setMenuModel(MenuModel menuModel) {
        this.menuModel1 = menuModel1;
    }

    public void back() {
        addMessage("Back", "Back Clicked");
    }

    public void forward() {
        addMessage("Forward", "Forward Clicked");
    }

    public void reload() {
        addMessage("Reload", "Reload Clicked");
    }

    public void saveas() {
        addMessage("Saveas", "Save as Clicked");
    }

    public void addMessage(String summary, String detail) {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, summary, detail);
        FaceContext.getCurrentInstance().addMessage(null, message);
    }
}
