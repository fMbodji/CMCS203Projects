
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button button1, button2, button3, button4, button5, button6;
	Label label ;
	TextField textfield ;
	//  declare two HBoxes
	HBox HBox1, HBox2;
	
	TextField myTField;
	
	//student Task #4:
	//  declare an instance of DataManager
	DataManager DataManager;
	
	Insets inset;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button6 = new Button("French");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		
		label = new Label("Feedback");
		//  instantiate the HBoxes
		HBox1 = new HBox();
		HBox2 = new HBox();
		
		textfield = new TextField();
		
		//student Task #4:
		//  instantiate the DataManager instance
		DataManager = new DataManager();
		//  set margins and set alignment of the components
		inset = new Insets(20, 20, 20, 20);
		
		HBox.setMargin(button1, inset); 
		HBox.setMargin(button2, inset); 
		HBox.setMargin(button3, inset); 
		HBox.setMargin(button4, inset); 
		HBox.setMargin(button5, inset); 
		HBox.setMargin(button6, inset); 
		HBox1.setAlignment(Pos.CENTER); 
		HBox2.setAlignment(Pos.CENTER); 
		 
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		HBox1.getChildren().addAll(label, textfield);
		//  add the buttons to the other HBox
		HBox2.getChildren().addAll(button1, button2, button3, button4, button5, button6);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(HBox1,HBox2);
		
		button1.setOnAction(new ButtonHandler());
		button2.setOnAction(new ButtonHandler());
		button3.setOnAction(new ButtonHandler()); 
		button4.setOnAction(new ButtonHandler());
		button5.setOnAction(new ButtonHandler());
		button6.setOnAction(new ButtonHandler());
	}
	
	private class ButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent event)
		{
			if (event.getTarget().equals(button1))
			{
				textfield.setText(DataManager.getHello());
			}
			else if (event.getTarget().equals(button2))
			{
				textfield.setText(DataManager.getHowdy());
			}
			else if (event.getTarget().equals(button3))
			{
				textfield.setText(DataManager.getChinese());
			}
			else if (event.getTarget().equals(button6))
			{
				textfield.setText(DataManager.getFrench());
			}
			else if (event.getTarget().equals(button4))
			{
				textfield.setText("");
			}
			else if (event.getTarget().equals(button5))
			{
				Platform.exit();  
				System.exit(0); 
			}
			
		}
			
	}
}
	
















	