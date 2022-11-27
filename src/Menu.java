import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// David Nordström och Robin Andersson har gjort denna klass
public class Menu  {

    Button startButton;
    Button exitButton;

    HBox hBox = new HBox();
    Image image = new Image(getClass().getResourceAsStream("BattleShip.png")); // Lägger till bilden som ska vara till bakgrunden

    GameController gameController = new GameController();

    //Metod för så man får upp fönstret för att välja om man vill stänga ner programmet med krysset
    public void present(Stage stage) {
        stage.setOnCloseRequest(e -> {
            e.consume(); // Gör så man får frågan när man trycker på krysset för att stänga ner programmet
            exitProgram();
        });

        startButton = new Button("Start Game"); // Start knappen
        startButton.setOnAction(e -> {
            if (gameController.gameview == null) {
                gameController.createGameview(stage);
            }
            gameController.gameview.PresentGameView(stage); //Gör så man får upp gameview
        });

        exitButton = new Button("Exit Game");
        exitButton.setOnAction(e -> exitProgram()); // Funktion till exit knappen. Stänger ner progrannet

        hBox.setSpacing(50);
        hBox.getChildren().add(startButton);
        hBox.getChildren().add(exitButton);
        hBox.setPadding(new Insets(400, 200, 200, 325));
        startButton.setMinWidth(150); // Sätter den minsta bred storleken på start knappen
        startButton.setMaxWidth(150); // Sätter den största bred storleken på start knappen
        startButton.setMinHeight(20); // Sätter den minsta höjd storleken på start knappen
        startButton.setMaxHeight(50); // Sätter den största höjd storleken på start knappen
        exitButton.setMinWidth(150); // Samma som start knappen
        exitButton.setMaxWidth(150);
        exitButton.setMinHeight(20);
        exitButton.setMaxHeight(50);

        VBox vBox = new VBox();
        vBox.getChildren().add(hBox);
        vBox.setAlignment(Pos.CENTER);
        // Sätter storleken för bakgrunden och gör att den passar in i fönstret. Contain för att se till att bakgrunds bilden inte går utanför fönstret. Cover gör att den täker hela fönstret
        BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);
        // gör bakgrunden och sätter in storleken och att den inte ska vara i de andra fönstren
        Background background = new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size));
        vBox.setBackground(background);
        Scene scene = new Scene(vBox, 1000, 900);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    //Metod för att stänga ner programmet
    private void exitProgram() {
        boolean yesNo = ConfirmBox.display("Exit Game", "Are you sure you want to exit game?"); // Sätter titeln på fönstret och vad message ska vara
        if(yesNo) {
            System.exit(0); // Stänger ner programmet
        }
    }
}
