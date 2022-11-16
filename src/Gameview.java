import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
public class Gameview {

    private Stage stage;
    private Gameboard enemyBoard;
    private Gameboard playerBoard;


    public Gameview(Stage stage) {
        this.stage = stage;
        this.enemyBoard = new Gameboard();
        this.playerBoard = new Gameboard();
    }
    //Presentmeny - for rendera Gameviews
    //This is where we use show method.
    //Hboc, to contain a gridpane, should return enemny/player Gridpane

}





