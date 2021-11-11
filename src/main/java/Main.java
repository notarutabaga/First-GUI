import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

//Application is the parent class, Main is the child class and inherits everything from parent
public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //
        Parent root = FXMLLoader.load(getClass().getResource("newfxml.fxml"));

        stage.getIcons().add(new Image("C:\\Users\\hammy\\OneDrive\\Desktop\\secondGUI\\src\\main\\butterflyicon.png"));
        stage.setTitle("notarutablog");
        stage.setScene(new Scene(root, 700, 575));
        stage.show(); //always at the end of the start method
    }
}
