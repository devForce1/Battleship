import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Iterator;


public class Gameboard {
    // Properties - Image variables
    private String colorBlue = "blue.png";
    private String colorYellow = "yellow.png";
    private String colorRed = "red.png";
    private String colorBlack = "black.png";


    // Char arrays for x/y postitions
    private static char[] xpos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private static char[] ypos = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    private  Coordinate[][] coordinates = new Coordinate[10][10];
    //status av koordinater
    //0: tom
    //1: tom, men skjuten
    //2: inte tom
    //3: inte tom och skjuten
    private  static  int fieldSatus;

    static ArrayList<Ship> fleet =  new ArrayList<Ship>();

    //ImageView array to hold the Images
    private ImageView[][] gridImages = new ImageView[10][10];


    public Gameboard() {
        createCoordinates();
    }

    public void createCoordinates() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                coordinates[j][i] = new Coordinate(xpos[j], ypos[i], false, false, colorBlue);
            }
        }
    }
    public GridPane createGameBoard () {
        GridPane gridpane = new GridPane();
        gridpane.setMinSize(400,400);
        gridpane.setVgap(1);
        gridpane.setHgap(1);
        gridpane.setAlignment(Pos.CENTER);

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                gridImages[j][i] = new ImageView();
                gridImages[j][i].setImage(new Image(coordinates[j][i].getCoordinateImageName()));
                gridpane.add(gridImages[j][i], j,i);
                //info om field status, alla tom och inte skjutna
                fieldSatus = 0;
            }
        }
        return gridpane;
    }
    public int getFieldStatus(){
      return fieldSatus;
    }

    public static boolean canPlaceShip(Ship aShip){

        /// does this even work?
        Iterator<Coordinate> iterate = (Iterator<Coordinate>) aShip.coordinatesArray.iterator();
        while(iterate.hasNext()){
            Coordinate field = iterate.next();
            char x = field.getXcoordinate();
            char y = field.getYcoordinate();
            if( fieldSatus != 0){
                return false;
            }
        }
        if(fieldSatus != 0){
            return false;
        }
        return true;
    }
    public static void placeShip(Ship aShip)
    throws FieldOccupied {
        Iterator<Coordinate> iterate = (Iterator<Coordinate>) aShip.coordinatesArray.iterator();
        while(iterate.hasNext()){
            Coordinate placeCoordinate = iterate.next();
            char x = placeCoordinate.getXcoordinate();
            char y = placeCoordinate.getYcoordinate();
            //
            if(fieldSatus != 0){
                throw new FieldOccupied(placeCoordinate, "field already occupied");
            } else {
                fieldSatus = 2;
            }
        }
        fleet.add(aShip);
    }
}




