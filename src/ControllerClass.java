
public class ControllerClass {
private ModelClass TheModel;
private ViewClass TheView;

public  ControllerClass( ModelClass TheModel, ViewClass TheView) {
	this.TheView=TheView;
	this.TheModel=TheModel;
	
	this.TheView.addCalculationListner(new CalculateListener());
	
}
}
