import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import java.util.List;


public class Gridview extends Application {
    public static void main(String [] args){
        launch(args);
    }

    Stage window;
    String colorBlue = "blue.png";
    String colorYellow = "yellow.png";
    String colorRed = "red.png";
    String colorBlack = "black.png";
    ImageView [][] gridImage = new ImageView[10][10];
    Image blueImage = new Image(getClass().getResourceAsStream(colorBlue));
    Image yellowImage = new Image(getClass().getResourceAsStream(colorYellow));
    Image blackImage = new Image(getClass().getResourceAsStream(colorBlack));
    Image redImage = new Image(getClass().getResourceAsStream(colorRed));

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Battleship Gameboard");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);

        window.setOnCloseRequest(e -> {
            e.consume();
            exitProgram();
        });


        for(int j = 0; j<10;j++) {

            for(int i = 0; i<10;i++) {

                ImageView imageview = new ImageView();
                imageview.setImage(blueImage);
                gridImage[j][i] = imageview;
                grid.add(gridImage[j][i],j,i);

            }
        }

        gridImage[0][3].setImage(yellowImage);
        gridImage[1][4].setImage(redImage);
        gridImage[2][5].setImage(blackImage);
        gridImage[3][6].setImage(yellowImage);

        Scene scene = new Scene(grid, 500, 500);
        window.setScene(scene);
        window.show();
        window.setResizable(false);

    }

    private void exitProgram() {
        boolean yesNo = ConfirmBox.display("Exit Game", "Are you sure you want to exit game");
        if(yesNo) {
            window.close();
        }
    }



}
