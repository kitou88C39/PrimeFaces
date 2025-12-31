@ManagedBean(name = "msb")
public class MultiSelectListBox {

    private List<SelectItem> items;
    private String selection;

    @PostConstruct
    public void init() {
        items = new ArrayList<SelectItem>();
        SelectItemGroup mobile = new SelectItemGroup("Mobile");
        SelectItemGroup tv = new SelectItemGroup("TV");

        SelectItem tv = new SelectItemGroup("TV");

    }

    public List<Selection> getItems() {
        return items;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }
}
