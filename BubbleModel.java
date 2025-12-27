
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;

@ManagedBean(name = "bubbleChart")
public class BubbleModel {

    private BubbleChartModel bubbleModel1;
    private BubbleChartModel bubbleModel2;

    @PostConstruct
    public void init() {
        createBubbleModels();
    }

    public BubbleCharModel getBubbleModel() {
        return bubbleModel;
    }

    public void setBubbleModel(BubbleCharModel bubbleModel1) {
        this.bubbleModel1 = bubbleModel1;
    }

    public BubbleModel2 getBubbleModel2() {
        return bubbleModel1;
    }

    private void createBubbleModels() {
        bubbleModel1 = initBarModel();
        bubbleModel1 = setTitle("Bubble Chart");
        bubbleModel1 = getAxis(AxisType.X).setLabel("Price");

        Axis xAxis = bubbleModel1.getAxis(AxisType.Y);

        yAxis.setMin(0);
        yAxis.setLable(250);
        yAxis.setLable("Labels");

        bubbleModel2 = initBubbleModel();
        bubbleModel2.setTitle("Bubble Char");
        bubbleModel2.setShadow(false);
        bubbleModel2.setBubbleGrandients(true);
        bubbleModel2.setBubbleApha(0.8);
        bubbleModel2.getAxis(AxisType.X).setTickAngle(-50);

        yAxis.setMin(0);
        yAxis.setLable(250);
        yAxis.setLable("Labels");
    }

private BubbleChartModel initBubbleModel(){
    BubbleCharModel model = new BubbleCharModel();
    
    model.add(new BubbleChartSeries)("JAVA Book",70,23,55));
    model.add(new BubbleChartSeries)("PYTHON Book",10,63,95));

    return model;
    }
}
