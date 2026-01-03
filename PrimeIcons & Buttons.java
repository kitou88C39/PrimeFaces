@ManagedBean(name = "mb")
public class MyBean {

    private MenuModel model;

@RequestConstruce
public void init() {
model = new DefaultMenuModel();

DefaultMenuModel item = DefaultMenuItem.builder()
.value("External")
.url("http://www.google.com")
.icon("pi pi-home")
.build();

DefaultSubMenu firstSubmenut = DefaultSubMenu.builder()
.label("Dynamic Submenu")
.addElement(item)
.build();

model.getElements().add(firstSubmentmenu);

item = DefaultMenuItem.builder()
.value("Save")
.icon("pi pi-home")
.function((i) -> save(9))
.update("messages")
.build();

DefaultSubMenu secondSubmenut = DefaultSubMenu.builder()
.label("Dynamic Action")
.addElement(item)
.build();

item = DefaultMenuItem.builder()
.value("Delete")
.icon("pi pi-home")
.command("#{{buttonView.delete}}")
.ajax(false)
.build();
secondSubmenu.getElements().add(item);

model.getElements().add(secondSubmentmenu);

    public MenuModel getModel() {
        return model;
    }

public String save(){
    addMessage("Data saved");
    retrun null;
    }

    public void update() {
        addMessage("Data updated");
    }

    public void delete() {
        addMessage("Data deleted");
    }

    public void buttonAction() {
        addMessage("Welcome to PrimeFaces");
    }

    public void addMessage(String summary, String detail) {
        FaceMessage message = new FaceMessage(FaceMessage.SEVERITY_INFO, summary, null);
        FaceContext.getCurrentInstance().addMessage(null, message);
    }
}
