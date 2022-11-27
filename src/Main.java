import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

      public static void main (String[] args) throws IOException {
          launch(args);
      }

    @Override
    public void start(Stage primaryStage) throws Exception {
          //Titel // size // lock scene
        Menu menu = new Menu(); // Gör en menu
        menu.present(primaryStage); // Sätter menu som ett huvud fönster
    }

}