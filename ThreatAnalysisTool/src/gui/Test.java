package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test extends Application {

	private static Stage stg;
	private int level;

	public Test(int level) {
		this.level = level;
	}

	
	public Test() {
	}

	public void start(Stage primaryStage) {
		try {
			stg = primaryStage;
			stg.setMinHeight(400);
			stg.setMinWidth(640);
			Parent root = (BorderPane) FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root, 700, 500);
			stg.setMaximized(true);
			stg.setScene(scene);
			stg.setTitle("Threat Analysis Tool");
			stg.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void changeScene(String fxml) throws IOException {
		Parent pane = FXMLLoader.load(getClass().getResource(fxml));
		
		stg.getScene().setRoot(pane);
	}

	public static void main(String[] args) {

		launch(args);
	}
}
