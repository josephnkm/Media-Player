package application;
	
import javafx.application.Application;
import javafx.scene.paint.Color;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Player player = new Player("file:///C:/03 MediaPlayer Creating Classes - YouTube.MP4");
		Scene scene= new Scene(player, 640, 360, Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
