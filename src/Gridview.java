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




    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = primaryStage;
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        /*Image image = new Image(getClass().getResourceAsStream("BattleShip.png"));*/
        ImageView [][] gridImage = new ImageView[10][10];


        /*grid.add(imageview,0,0);*/

        /*for(int i = 0;i<10;i++) {
           *//* Image image = new Image(getClass().getResourceAsStream("blue.png"));*//*
            *//*ImageView imageview = new ImageView(image);*//*
            gridImage.getClass().getResourceAsStream("blue.png");
            grid.add(gridImage[0][0],0,0);
        }*/


       /* for(int j = 0;j<10;j++) {

            for (int i = 0; i<10; i++) {


                gridImage[i][j] = new ImageView();
                grid.add(gridImage[0][0],0,0);
            }
        }*/


        /*grid.add(gridImage[0][0],0,0);*/
        Scene scene = new Scene(grid, 400, 400);
        window.setScene(scene);

        window.show();

    }

}
