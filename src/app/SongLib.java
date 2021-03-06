//by Scott Skibin, Tim Altonji
package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.SongListController;
 
public class SongLib extends Application {

    @Override
	public void start(Stage primaryStage) throws Exception {
		
		// set up FXML loader
		FXMLLoader loader = new FXMLLoader();   
		loader.setLocation(getClass().getResource("/view/SongList.fxml"));
		
		// load the fxml
		AnchorPane root = (AnchorPane)loader.load();
		
		//get controller class through loader
		SongListController listController = loader.getController();
		listController.start(primaryStage);

		Scene scene = new Scene(root, 500, 500);
		primaryStage.setTitle("Song Library");
		primaryStage.setScene(scene);
        primaryStage.setResizable(false);
		primaryStage.show();
    }

    public static void main(String[] args) {
		launch(args);
    }
}