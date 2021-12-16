import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primarySatage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
        primarySatage.setTitle("Tetris Game");
        primarySatage.setScene(new Scene(root,300,400));
        primarySatage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
