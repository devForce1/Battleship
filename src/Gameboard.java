import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;


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

    static ArrayList<Ship> fleet =  new ArrayList<Ship>();

    //ImageView array to hold the Images
    private ImageView[][] gridImages = new ImageView[10][10];


    // Constructor to call method to create a 10 x 10 2D array of coordinate object, so that its all set up when creating a new gaeboard
    public Gameboard() {
        createCoordinates();
    }
    //Method to create a 2 D array of coordinate objects
    public void createCoordinates() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                coordinates[j][i] = new Coordinate(xpos[j], ypos[i], false, false, colorBlue);

            }
        }
    }
    //David Nordström och Robin Andersson har gjort denna klass
    // Skapar spelplanen
    public GridPane createGameBoard () {
        GridPane gridpane = new GridPane(); //Gör en gridpane
        gridpane.setMinSize(400,400); // Sätter storleken på spelplanen
        gridpane.setVgap(1); // Vertikala mellanrummet för gridpanen
        gridpane.setHgap(1); // Horisontella mellanrummet för gridpane
        gridpane.setAlignment(Pos.CENTER); // Sätter gridpane postionen
        gridpane.setStyle("-fx-background-color: white"); // Gör bakgrunden gör gridpanen vit. Gör så det ser ut som ett mönster

        // Gör for lopp för att skapa indexen (koordinaterna) för spelplanen och lägger in bilderna
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {

                gridImages[j][i] = new ImageView();
                gridImages[j][i].setImage(new Image(coordinates[j][i].getCoordinateImageName()));
                gridpane.add(gridImages[j][i], j,i);
              
            }
        }
        return gridpane;
    }

    // Setters & Getters som kunde ha kommit till anvädning

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




