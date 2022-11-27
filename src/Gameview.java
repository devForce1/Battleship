import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Gameview {

    // Robin Andersson & David Nordström har gjort denna klass
    private Stage stage;
    private Gameboard enemyBoard;
    private Gameboard playerBoard;
    private Ship enemyShips;
    private Ship plaeyerShips;
    Image image = new Image(getClass().getResourceAsStream("BattleShipGameView.png")); // Lägger till bilden som ska vara till bakgrunden
    Button serverButton;
    Button clientButton;
    Button exitButton;

    GameController gameController;

    public Gameview(GameController gameController, Stage stage) {
        this.stage = stage;
        this.enemyBoard = new Gameboard();
        this.playerBoard = new Gameboard();
        serverButton = new Button("Start Server");
        clientButton = new Button("Start client");
        exitButton = new Button("Exit Button");

        // Knapparnas funktion
        serverButton.setOnAction(e -> {
            gameController.setMode(GameController.ModeT.Server); // Detta har Adam gjort
        });

        clientButton.setOnAction(e -> {
            gameController.setMode(GameController.ModeT.Client); // Detta har Adam gjort
        });

        exitButton.setOnAction(e -> exitProgram()); // Stänger ner programmet
    }


    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public void PresentGameView(Stage stage) {
        HBox hBox2 = new HBox(1); // Gör hboxen för server och klient knapparna
        HBox hBox = new HBox(1); // Gör hboxen för gameboarden
        HBox hBox3 = new HBox(10); //hboxen för exit kanppen
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER); // Position för för båda gameboard
        hBox.getChildren().add(enemyBoard.createGameBoard()); // Klient gameboarden läggs in i fönstret
        hBox.getChildren().add(playerBoard.createGameBoard()); // Server gameboarden läggs in i fönstret
        hBox2.getChildren().add(serverButton); // Lägger in server knappen
        hBox2.getChildren().add(clientButton); // Lägger in klient knappen
        hBox2.setAlignment(Pos.TOP_CENTER); // Positonen för server och klient knapparna
        hBox3.getChildren().add(exitButton); // Lägger in exit knappen
        hBox3.setAlignment(Pos.BASELINE_CENTER); // Sätter positionen för exit knappen
        hBox2.setSpacing(380); // Mellanrummet för server och klient knapparna
        hBox2.setPadding(new Insets(60,0,20,0)); // Gör att hboxen får en viss distans från fönster kanterna
        hBox3.setPadding(new Insets(10,0,0,0)); // Gör att hboxen får en viss distans från fönster kanterna

        VBox vBox = new VBox(); //Skapar vboxen
        vBox.getChildren().add(hBox2); //Lägger in alla hbox i vboxen
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(hBox3);
        vBox.setAlignment(Pos.CENTER);
        // Sätter storleken för bakgrunden och gör att den passar in i fönstret. Contain för att se till att bakgrunds bilden inte går utanför fönstret. Cover gör att den täker hela fönstret
        BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);
        // gör bakgrunden och sätter in storleken och att den inte ska vara i de andra fönstren
        Background background = new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size));
        vBox.setBackground(background); // Lägger in bakgrunden i vboxen
        Scene scene = new Scene(vBox, 1000, 900); // Sätter storlekn på fönstret
        stage.setScene(scene); // Sätter in scenen i fönstret
        stage.show(); // Gör så man vissar fönstret
        stage.setResizable(false); // Gör att man inte kan äbndra storlken på fönstret
    }


    // Setters & Getters
    public Gameboard getEnemyBoard() {
        return enemyBoard;
    }

    public void setEnemyBoard(Gameboard enemyBoard) {
        this.enemyBoard = enemyBoard;
    }

    public Gameboard getPlayerBoard() {
        return playerBoard;
    }

    public void setPlayerBoard(Gameboard playerBoard) {
        this.playerBoard = playerBoard;
    }

   //Metod för att stänga ner programmet
    private void exitProgram() {
        boolean yesNo = ConfirmBox.display("Exit Game", "Are you sure you want to exit game?"); // Sätter titeln på fönstret och vad message ska vara
        if (yesNo) {
            System.exit(0); // Stänger ner programmet
        }
    }
}





