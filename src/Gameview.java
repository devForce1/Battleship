import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Gameview {

    private Stage stage;
    private Gameboard enemyBoard;
    private Gameboard playerBoard;

    Image image = new Image(getClass().getResourceAsStream("BattleShipGameView.png"));
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

        serverButton.setOnAction(e -> {
            gameController.setMode(GameController.ModeT.Server);
        });

        clientButton.setOnAction(e -> {
            gameController.setMode(GameController.ModeT.Client);
        });

        exitButton.setOnAction(e -> exitProgram());
    }


    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }
    public void PresentGameView(Stage stage) {
        HBox hBox2 = new HBox(1);
        HBox hBox = new HBox(1);
        HBox hBox3 = new HBox(10);
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(enemyBoard.createGameBoard());
        hBox.getChildren().add(playerBoard.createGameBoard());
        hBox2.getChildren().add(serverButton);
        hBox2.getChildren().add(clientButton);
        hBox2.setAlignment(Pos.TOP_CENTER);
        hBox3.getChildren().add(exitButton);
        hBox3.setAlignment(Pos.BASELINE_CENTER);
        hBox2.setSpacing(380);
        hBox2.setPadding(new Insets(60,0,20,0));
        hBox3.setPadding(new Insets(10,0,0,0));

        VBox vBox = new VBox();
        vBox.getChildren().add(hBox2);
        vBox.getChildren().add(hBox);
        vBox.getChildren().add(hBox3);
        vBox.setAlignment(Pos.CENTER);
        BackgroundSize size = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);
        Background background = new Background(new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, size));
        vBox.setBackground(background);
        Scene scene = new Scene(vBox, 1000, 900);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }


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

    private void exitProgram() {
        boolean yesNo = ConfirmBox.display("Exit Game", "Are you sure you want to exit game?");
        if (yesNo) {
            System.exit(0);
        }
    }
}





