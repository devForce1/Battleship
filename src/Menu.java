import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Menu extends Application {

    Stage window;
    Button startButton;
    Button exitButton;

    HBox hBox = new HBox();
    Image image = new Image(getClass().getResourceAsStream("BattleShip.png"));

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Battle Ship");
        Group root = new Group();

        window.setOnCloseRequest(e -> {
            e.consume();
            exitProgram();
        });

        startButton = new Button("Start Game");
        startButton.setOnAction(e -> {
            startProgram();
        });

        exitButton = new Button("Exit Game");
        exitButton.setOnAction(e -> exitProgram());


        hBox.setSpacing(50);
        hBox.getChildren().add(startButton);
        hBox.getChildren().add(exitButton);
        hBox.setPadding(new Insets(400, 200, 200, 500));
        startButton.setMinWidth(150);
        startButton.setMaxWidth(150);
        startButton.setMinHeight(20);
        startButton.setMaxHeight(50);
        exitButton.setMinWidth(150);
        exitButton.setMaxWidth(150);
        exitButton.setMinHeight(20);
        exitButton.setMaxHeight(50);


        VBox VBox = new VBox();
        VBox.getChildren().add(hBox);
        VBox.setAlignment(Pos.CENTER);
        BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);
        Background background = new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size));
        VBox.setBackground(background);
        Scene scene = new Scene(VBox, 1300, 1200);
        window.setScene(scene);
        window.show();
    }

    private void exitProgram() {
        boolean yesNo = ConfirmBox.display("Exit Game", "Are you sure you want to exit game?");
        if(yesNo) {
            window.close();
        }
    }

    private void startProgram() {
        boolean startServer = StartGame.display("Start Game","What do you want to start?" );
        if(startServer) {

        }
    }


}
