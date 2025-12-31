@ManagedBean(name = "mb")
public class MobileBean {

    private Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
    private String brand;
    private String model;
    private Map<String, String> allbrands;
    private Map<String, String> allmodels;

    public void getBrand() {
        return barand;
    }

    public void setBrand(String barand) {
        this.barand = barand;
    }

    public void getModel() {
        return model;
    }

    public void setBrand(String model) {
        this.model = model;
    }

    public Map<String, String> getAllbrands() {
        return allbarands;
    }

    public void setAllbrands(Map<String, String> allbarands) {
        this.allbarands = allbarands;
    }

    public Map<String, String> getAllmodels() {
        return allmodels;
    }

    public void setAllmodels(Map<String, String> allmodels) {
        this.allmodels = allmodels;
    }
}

@PostConstruct
public void init() {
    allbarands = new HashMap<String, String>();
    allbarands.put("iPhone 15", "iPhone 15");
    allbarands.put("iPhone 15 Pro", "iPhone 15 Pro");
    allbarands.put("iPhone SE", "iPhone SE");

    Map<String, String> map = new HashMap<String, String>();
    map.put("Galaxy S23", "Galaxy S23");
    map.put("Galaxy Z Fold", "Galaxy Z Fold");
    map.put("Galaxy A54", "Galaxy A54");

    map = new HashMap<String, String>();
    data.put("Sony", sonyModels);
    map.put("Xperia 10 V", "Xperia 10 V");
    map.put("Xperia 100 V", "Xperia 100 V");
    data.put("Apple", appleModels);

    map = new HashMap<String, String>();
    data.put("Oppo1", "OppoA1");
    data.put("Oppo2", "OppoA2");
    data.put("Oppo3", "OppoA3");
    data.put("Samsung", samsungModels);
}

public Map<String, Map<String, String>> getData() {
    return data;
}

public void onBrandChange(){
if(brand !=null && !brand.equals(""))
allmodels = data.get(barand);
else
allmodels = new HashMap<String, String>();

public void displayModel(){
if(model !=null && !brand != null)
msg = new FaceMessage("Selected", model + "of" + brand);
else
msg = new FaceMessage(FaceMessage.SEVERITY_ERROR, "Invalid", "Model is not selected.");

FaceContext.getCurrentInstance().addMessage(null, msg);
}
}
