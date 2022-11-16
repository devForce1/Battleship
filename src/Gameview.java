import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class Gameview {

    private Stage stage;
    private Gameboard enemyBoard;
    private Gameboard playerBoard;

    Image image = new Image(getClass().getResourceAsStream("BattleShip.png"));


    public Gameview(Stage stage) {
        this.stage = stage;
        this.enemyBoard = new Gameboard();
        this.playerBoard = new Gameboard();
    }
    //Presentmeny - for rendera Gameviews
    //This is where we use show method.
    //Hboc, to contain a gridpane, should return enemny/player Gridpane

    public void PresentGameView(Stage stage) {
        HBox hBox = new HBox(1);
        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(enemyBoard.createGameBoard());
        hBox.getChildren().add(playerBoard.createGameBoard());

        VBox vBox = new VBox();
        Label label = new Label("BattleShip");
        vBox.getChildren().add(label);
        label.setAlignment(Pos.TOP_CENTER);
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





