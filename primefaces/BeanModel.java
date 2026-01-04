import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import org.primefaces.model.menu.MenuModel;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultMenuItem;

@ManagedBean(name = "mb")
public class BeanModel {

    public MenuModel menuModel;

    @PostConstruct
    public void init() {

        menuModel = new DefaultMenuModel();
        DefaultMenuItem menuItem = new DefaultMenuItem();
        menuItem.setValue("Home");
        menuItem.setUrl("https:///www.");
        menuModel.addElement(menuItem);

        DefaultMenuItem menuItem1 = new DefaultMenuItem();
        menuItem1.setValue("JSF");
        menuItem1.setUrl("https:///www.");
        menuModel.addElement(menuItem1);
    }

    public MenuModel getMenuModel() {
        return menuModel;
    }

    public void setMenuModel(MenuModel menuModel) {
        this.menuModel = menuModel;
    }
}
