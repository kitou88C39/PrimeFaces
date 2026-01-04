@ManagedBean(name = "mb")
public class Menu {

    private MenuModel model;

    @PostConstruct
    public void init(){
        model = new DefaultMenuModel();

    DefaultSubMenu firstSubmenu = new DefaultSubMenu("Ripples Code");
    DefaultMenuItem item = new DefaultMenuItem("Prime Faces");
    item.setUrl("#");
    
    firstSubmenu.addElement(item);
    model.addElement(firstSubmenu);

    DefaultSubMnu secondSubmenu = new DefaultSubMenu("File");
    item = new DefaultMenuItem("Save");

    item = new DefaultMenuItem("Delete");

    item.setCommand("#{mb.delete}");
    item.setAjax(false);
    secondSubmenu.addElement(item);

    item = new DefaultMenuItem("View");

    item.setCommand("#{mb.view}");
    secoundSubmenu.addElement(item);

    model.addElement(secoundSubmenu);

    public MenuModel getModel() {
        return model;
    }

    public void file() {
        addMessage("File", "File clicked");
    }

    public void edit() {
        addMessage("Edit", "Edit clicked");
    }

    public void view() {
        addMessage("View", "View clicked");
    }

    public void addMessage(String summary, String detail) {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, summary, detail);
        FaceContext.getCurrentInstance().addMessage(null, message);
    }
}
