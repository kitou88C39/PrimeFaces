@ManagedBean(name = "donutChart")
public class BubbleModel {

    private DonutChartModel donutModel1;
    private DonutChartModel donutModel2;

    public DonutChartModel getDonutModel1() {
        return donutModel1;
    }

    public void setDonutModel1(DonutChartModel donutModel1) {
        this.donutModel1 = donutModel1;
    }

    public DonutChartModel getDonutModel2() {
        return donutModel2;
    }

    public void setDonutModel2(DonutChartModel donutModel2) {
        this.donutModel2 = donutModel1;
    }

    @PostConstruct
    public void init() {
        createDonutModels();
    }

    private void createDonutModel() {
        donutModel1 = initDonutModel();
        donutModel1 = setTitle("Donut Chart");
        donutModel1 = setLegendPosition("w");

        donutModel2 = initDonutModel();
        donutModel2 = setTitle("Custom Option");
        donutModel2 = setLegendPosition("e");
        donutModel2 = setSliceMargin(5);
        donutModel2 = setTitle("Donut Chart");
        donutModel2 = setShowDataLabels(true);
        donutModel2 = setDataFormat("value");
        donutModel2 = setShow(false);
    }

    private DonutCharModel initDonutModel(){
        DonutCharModel model = new DonutCharModel();

        Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
        circle1.put("Java", 150);
        circle1.put("Python", 400);
        model.addCircle(circle1);

        Map<String, Number> circle2 = new LinkedHashMap<String, Number>();
        circle2.put("Java", 540);
        circle2.put("Python", 125);
        model.addCircle(circle12);

        Map<String, Number> circle3 = new LinkedHashMap<String, Number>();
        circle3.put("Java", 40);
        circle3.put("Python", 325);
        model.addCircle(circle13);

        return model;
    }
