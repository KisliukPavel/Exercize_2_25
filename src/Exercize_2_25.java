/*(Odd or Even) Write an application that reads an integer and determines and prints whether it’s odd or even.*/


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Exercize_2_25 extends Application {
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	public void start(Stage primaryStage) throws Exception
	{
		String title = "Odd or Even";
		Parent root = FXMLLoader.load(getClass().getResource("Exercize_2_25.fxml"));
		primaryStage.setResizable(false);
		primaryStage.sizeToScene();
		primaryStage.setTitle(title);
		primaryStage.centerOnScreen();
		//-----------------------------------------------
		Scene s = new Scene(root);
		primaryStage.setScene(s);
		primaryStage.show();
	}
}