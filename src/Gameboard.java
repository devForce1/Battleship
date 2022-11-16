import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;


public class Gameboard {
    // Properties - Image variables
    private String colorBlue = "blue.png";
    private String colorYellow = "yellow.png";
    private String colorRed = "red.png";
    private String colorBlack = "black.png";
    // Char arrays for x/y postitions
    private char[] xpos = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private char[] ypos = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
    private  Coordinate[][] coordinates = new Coordinate[10][10];
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
            }
        }
        return gridpane;
    }
}



