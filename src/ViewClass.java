import javax.swing.*;
import java.awt.event.ActionListener;


public class ViewClass extends JFrame{
private JTextField firstNumber = new  JTextField(10);
private JLabel additionLabel = new JLabel("+");
private JTextField secondNumber = new  JTextField(10);
private JButton calculateButton = new JButton("calculate");
private JTextField calcSolution = new  JTextField(10);


ViewClass(){
	JPanel calcPanel = new JPanel();
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600,200);
	
	 calcPanel.add(firstNumber);
	 calcPanel.add(additionLabel);
	 calcPanel.add(secondNumber);
	 calcPanel.add(calculateButton);
	 calcPanel.add( calcSolution);
	 
	 this.add(calcPanel);
}

public int getFirstNumber() {
	return Integer.parseInt(firstNumber.getText());
}

public int getSecondNumber() {
	return Integer.parseInt(secondNumber.getText());
}

public int getcalcSolution() {
	return Integer.parseInt( calcSolution.getText());
}


public void setcalcSolution(String solution) {
	calcSolution.setText(""+solution);
}

void addCalculationListner(ActionListener listenforcalcButton) {
	calculateButton.addActionListener(listenforcalcButton);
}
}
