import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Menu  {

    Button startButton;
    Button exitButton;

    HBox hBox = new HBox();
    Image image = new Image(getClass().getResourceAsStream("BattleShip.png"));

    public void present(Stage stage) {
        stage.setOnCloseRequest(e -> {
            e.consume();
            exitProgram();
        });

        startButton = new Button("Start Game");
        startButton.setOnAction(e -> {
            Gameview gameview = new Gameview(stage);
            gameview.PresentGameView(stage);

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

        VBox vBox = new VBox();
        vBox.getChildren().add(hBox);
        vBox.setAlignment(Pos.CENTER);
        BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);
        Background background = new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size));
        vBox.setBackground(background);
        Scene scene = new Scene(vBox, 1300, 1200);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    private void exitProgram() {
        boolean yesNo = ConfirmBox.display("Exit Game", "Are you sure you want to exit game?");
        if(yesNo) {
            System.exit(0);
        }
    }
}
