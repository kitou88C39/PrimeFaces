import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;

@ManagedBean(name = "areaChar")
public class AreaModel {

    private LineCharModel areaModel;

    @PostConstruct
    public void init() {
        createAreaModel();
    }

    public LineCharModel getAreaModel() {
        return areaModel;
    }

    public void setAreaModel(LineCharModel areaModel) {
        this.areaModel = areaModel;
    }

    private void createAreaModel() {

        areaModel = new LineCharModel();

        LineChartSeries java = new LineChartSeries();
        java.setFill(true);
        java.setLabel("JAVA");
        java.set("2004", 120);
        java.set("2005", 100);
        java.set("2006", 44);
        java.set("2007", 150);
        java.set("2008", 25);

        LineChartSeries python = new LineChartSeries();
        python.setFill(true);
        python.setLabel("PYTHON");
        python.set("2004", 52);
        python.set("2005", 60);
        python.set("2006", 220);
        python.set("2007", 10);
        python.set("2008", 200);

        areaModel.addSeries(java);
        areaModel.addSeries(python);

        areaModel.setTitle("Area Chart");
        areaModel.setLengendPosision("sw");
        areaModel.setStacked(true);
        areaModel.setShowPointLabel(true);

        Axis zAxis = new CategoryAxis("Years");
        areaModel.getAxes().put(AxisType.x, zAxis);
        zAxis.setLabel("Developers");
        zAxis.setMin(0);
        zAxis.setMax(300);
    }
}
