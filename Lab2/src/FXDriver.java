import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {
	   
	/**
	 * The main method for the GUI example program JavaFX version
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {
		launch(args);   
	}
		   
	@Override
	public void start(Stage stage) throws IOException {
		//student Task #1:
		//  instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
		
		//set stage title
		stage.setScene(new Scene(root,600,400)); 
		root.setAlignment(Pos.CENTER);
		
		//  set the scene to hold root
		stage.setTitle("Hello World GUI");
		
		//display the stage
		stage.show(); 

	}
}
