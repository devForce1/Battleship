import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Menu extends Application {

    Stage window;
    Button startButton;
    Button exitButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Battle Ship");

        startButton = new Button("Start");
        startButton.setOnAction(e -> {});

        exitButton = new Button("Exit");
        exitButton.setOnAction(e -> {});

        StackPane layout = new StackPane();
        layout.getChildren().add(startButton);
        Scene scene = new Scene(layout, 1200, 800);
        window.setScene(scene);
        window.show();
    }


}
