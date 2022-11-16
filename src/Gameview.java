import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class Gameview {

    private Stage stage;
    private Gameboard enemyBoard;
    private Gameboard playerBoard;
    Image image = new Image(getClass().getResourceAsStream("BattleShipGameView.png"));


    public Gameview(Stage stage) {
        this.stage = stage;
        this.enemyBoard = new Gameboard();
        this.playerBoard = new Gameboard();
    }
    public void PresentGameView(Stage stage) {
        HBox hBox = new HBox(1);
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(enemyBoard.createGameBoard());
        hBox.getChildren().add(playerBoard.createGameBoard());

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

}





