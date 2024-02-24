package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application 
{
	@Override
	public void start(Stage primaryStage) 
	{
		GridPane grid = new GridPane();
		//This should create a pane to hold the images.
		
		grid.add(new ImageView(new Image("Images/flag1.gif")), 0, 0);
		grid.add(new ImageView(new Image("Images/flag2.gif")), 1, 0);
		grid.add(new ImageView(new Image("Images/flag6.gif")), 0, 1);
		grid.add(new ImageView(new Image("Images/flag7.gif")), 1, 1);
		//This should add the images to the grid.
		
		Scene scene = new Scene(grid);
		primaryStage.setTitle("Display Images");
		//This should set the stage title.
		primaryStage.setScene(scene);
		//This should set the scene.
		primaryStage.show();
		//This should show the GUI.
		
	
	
	}
}
