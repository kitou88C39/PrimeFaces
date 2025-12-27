import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;

@ManagedBean(name="barChart")
public class BarChart {
    
    private BarCharModel barModel;
    private HorizontalBarCharModel horizontalBarCharModel;

    @PostConstruct
    public void init(){
        createBarModel();
    }

    public BarCharModel getBarModel(){
        return BarModel;
    }

    public void setBarModel(BarCharModel barModel){
        this.barModel = barModel;
    }

    public HorizontalBarCharModel getHorizontalBarModel(){
        return horizontalBarModel;
    }

    private void createBarModels(){
        createBarModel();
        createHorizontalBarModel();
    }

    private void createBarModels(){
        barModel = initBarModel();

        barModel = setTitle("Bar Chart");
        barModel = setLegendPosison("ne");

        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLable("Language");

        Axis xAxis = barModel.getAxis(AxisType.Y);
        xAxis.setLable("Jobs");
        yAxis.setMin(0);
        yAxis.setLable(200);
    }

    private void createHorizontalBarModer(){

    }

    horizontalBarModel model = new HorizontalBarModel();

    ChartSeries java = new ChartSeries();
    java.setLabel("JAVA");
    java.set("2004",120);
    java.set("2005",100);
    java.set("2006",44);
    java.set("2007",150);
    java.set("2008",25);

    ChartSeries python = new ChartSeries();
    python.setFill(true);
    python.setLabel("PYTHON");
    python.set("2004",52);
    python.set("2005",60);
    python.set("2006",220);
    python.set("2007",10);
    python.set("2008",200);

    model.addSeries(java);
    model.addSeries(python);

    return model;
    }}
