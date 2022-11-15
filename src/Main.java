import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.*;

public class Main extends Application {

      public static void main (String[] args) {
          launch(args);
      }

    @Override
    public void start(Stage primaryStage) throws Exception {
          //Titel // size // lock scene
        Menu menu = new Menu();
        menu.present(primaryStage);
    }

}