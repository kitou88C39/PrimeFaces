@ManagedBean(name = "checkboxView")
public class SelectCheckboxMenu {

    private String[] selectedColors;
    private String[] selectedColors2;
    private List<String> colors;
    private List<SelecteItem> primaryColors;
    private String[] selectedPrimaryColors;

    @PostConstruct
    public void init(){
        colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Purple");
    
    primaryColors = new ArrayList<SelecetItem>();
    SelectItemGroup pc = new SelectItemGroup("primaryColors");
    pc.setSelectItems(new SelectItem[]){
        new SelectItem("Red","RED"),
        new SelectItem("Green","GREEN"),
        new SelectItem("Blue","BLUE")
    });
    
    SelectItemGroup rc = new SelecetItemGroup("Rest Colors");
    pc.setSelectItems(new SelectItem[]){
        new SelectItem("Orange","ORANGE"),
        new SelectItem("Yellow","YELLOW"),
        new SelectItem("Purple","PURPLE")
    });
    
    primaryColors.add(pc);
    primaryColors.add(rc);
    
    }

    public String[] getSelectedColors() {
        return selectedColors;
    }
}
