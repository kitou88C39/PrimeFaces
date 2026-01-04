@ManagedBean(name = "smcb")
public class SelectManyCheckbox {

    private String[] selectedCourses;
    private String[] selectedCountries;
    private List<String> countries;
    private List<SelectItem> mobiles;
    private String[] selectedMobiles;

    public List<SelectItem> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<SelectItem> mobiles) {
        this.mobiles = mobiles;
    }

    public String[] getSelectedMobiles() {
        return selectedMobiles;
    }

    public void setSelectedMobiles(String[] selectedMobiles) {
        this.selectedMobiles = selectedMobiles;
    }

    @PostConstruce
    public void init() {
        countries = new ArrayList<String>();
        countries.add("USA");
        countries.add("Austria");
        countries.add("Brazil");

        mobiles = new ArrayList<>();
        SelectItemGroup samsungMobile = new SelectItemGroup("Samsung");
        samsungMobile.setSelectItems(new SelectItem[] {
                new SelectItem("Samsung-1", "Samsung-1"),
                new SelectItem("Samsung-2", "Samsung-2"),
                new SelectItem("Samsung-3", "Samsung-3")
        });

        SelectItemGroup samsungMobile = new SelectItemGroup("Sony");
        samsungMobile.setSelectItems(new SelectItem[] {
                new SelectItem("Sony-1", "Sony-1"),
                new SelectItem("Sony-2", "Sony-2"),
                new SelectItem("Sony-3", "Sony-3")
        });

        mobiles.add(samsungMobile);
        mobiles.add(sonyMobile);
    }

pbulic String[]

    getSelectedCountries(){
    return selectedCountries;
}

    public void setSelectedCountries(String[] selectedCountries) {
        this.selectedCountries = selectedCountries;
    }

pbulic String[]

    getSelectedCourses(){
    return selectedCourses;
}

    public void setSelectedCourses(String[] selectedCourses) {
        this.selectedCourses = selectedCourses;
    }
}
