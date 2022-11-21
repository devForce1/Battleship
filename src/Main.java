import javafx.application.Application;
import javafx.stage.Stage;
import java.lang.Process;
import java.lang.ProcessBuilder;

import java.io.IOException;

public class Main extends Application {

      public static void main (String[] args) throws IOException {
          launch(args);
          System.out.println("Main test1");
/*          try {
              Process process1 = new ProcessBuilder("Server").start();
              Process process2 = new ProcessBuilder("Client").start();
          } catch (IOException e) {
              throw new RuntimeException(e);
          }
*/
      }

    @Override
    public void start(Stage primaryStage) throws Exception {
          //Titel // size // lock scene
        System.out.println("Main test2");
        try {
            Process process1 = new ProcessBuilder("Server").start();
            Process process2 = new ProcessBuilder("Client").start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Menu menu = new Menu();
        menu.present(primaryStage);
    }

}