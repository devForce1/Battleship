import javafx.geometry.Pos;
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
    static char[] xpos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static char[] ypos = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    private  Coordinate[][] coordinates = new Coordinate[10][10];
    //status av koordinater
    //0: tom
    //1: tom, men skjuten
    //2: inte tom
    //3: inte tom och skjuten
    private  static  int[][] fieldSatus;

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
            fieldSatus = new int[9][9];
            for (int i = 0; i < 10; i++) {

                gridImages[j][i] = new ImageView();
                gridImages[j][i].setImage(new Image(coordinates[j][i].getCoordinateImageName()));
                gridpane.add(gridImages[j][i], j,i);
                fieldSatus[j][i] = 0;
            }
        }
        return gridpane;
    }
    public int[][] getFieldStatus(){
      return fieldSatus;
    }
    //method to check if the ship can be placed
    public static boolean canPlaceShip(Ship aShip) {

        //Loops through an array of coordinates
        Iterator<Coordinate> iterate = aShip.coordinatesArray.iterator();
        while (iterate.hasNext()) {
            Coordinate field = iterate.next();
            int x = field.getX();
            int y = field.getY();
            //if x is larger than index of the board on x axel or
            //if y is larger than index of the board on y axel
            if (x > Gameboard.xpos[x] || y > Gameboard.ypos[y]) {
                //you cant place ship there
                return false;
            }
            //if field status is not 0, the field is not empty and you cant place a ship there
            if (fieldSatus[x][y] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void placeShip(Ship aShip)
        // a custom exception
    throws FieldOccupied {
        //loops through all coordinates within the array
        Iterator<Coordinate> iterate = aShip.coordinatesArray.iterator();
        while(iterate.hasNext()){
            Coordinate placeCoordinate = iterate.next();
            //sets x and y coordinates
            int x = placeCoordinate.getX();
            int y = placeCoordinate.getY();
            //if field is occupied
            if(fieldSatus [x][y] != 0){
                throw new FieldOccupied(placeCoordinate, "field already occupied");
            } else {

                //sets field status to 2, means that the field is now occupied
                fieldSatus[x][y] = 2;
            }
        }
        fleet.add(aShip);
    }

    //cheks if the suggested shot wasnt already done
    public boolean canPlaceShot(Coordinate coord) {
        int x = coord.getX();
        int y = coord.getY();
        int field = fieldSatus[x][y];
        // If field value 0 or 2, it's OK to shoot
        // 0 - empty cell, 2 has ship on it
        if(field == 0 || field == 2) {
            return true;
        }
        return false;
    }
    //places the shot

    public int shot(Coordinate coordinate){
        // need to add invalid shot exception
        int x = coordinate.getX();
        int y = coordinate.getY();
        if (fieldSatus[x][y] == 1 || fieldSatus [x][y]== 3){
            System.out.println("this field has been shot already");
        }
        else if (fieldSatus[x][y] == 0){
            fieldSatus[x][y] = 1;
            return fieldSatus[x][y];
        } else{
            fieldSatus[x][y] = 3;
            for (Ship ship: fleet){
                if(ship.hasCoordinates(coordinate)){
                    ship.shipHit(coordinate);
                }
            }
        }
        return fieldSatus[x][y];
    }

    public String getColorBlue() {
        return colorBlue;
    }

    public void setColorBlue(String colorBlue) {
        this.colorBlue = colorBlue;
    }

    public String getColorYellow() {
        return colorYellow;
    }

    public void setColorYellow(String colorYellow) {
        this.colorYellow = colorYellow;
    }

    public String getColorRed() {
        return colorRed;
    }

    public void setColorRed(String colorRed) {
        this.colorRed = colorRed;
    }

    public String getColorBlack() {
        return colorBlack;
    }

    public void setColorBlack(String colorBlack) {
        this.colorBlack = colorBlack;
    }

    public static char[] getXpos() {
        return xpos;
    }

    public static void setXpos(char[] xpos) {
        Gameboard.xpos = xpos;
    }

    public static char[] getYpos() {
        return ypos;
    }

    public static void setYpos(char[] ypos) {
        Gameboard.ypos = ypos;
    }

    public Coordinate[][] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate[][] coordinates) {
        this.coordinates = coordinates;
    }

    public static int[][] getFieldSatus() {
        return fieldSatus;
    }

    public static void setFieldSatus(int[][] fieldSatus) {
        Gameboard.fieldSatus = fieldSatus;
    }

    public static ArrayList<Ship> getFleet() {
        return fleet;
    }

    public static void setFleet(ArrayList<Ship> fleet) {
        Gameboard.fleet = fleet;
    }

    public ImageView[][] getGridImages() {
        return gridImages;
    }

    public void setGridImages(ImageView[][] gridImages) {
        this.gridImages = gridImages;
    }
}




