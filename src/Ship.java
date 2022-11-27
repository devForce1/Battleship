import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    int shipSize;
    int xpos;
    int ypos;
    int alignment;
    //screates a new array for each ship
    private List<Coordinate> shipCoordinates = new ArrayList<>();
    //creates those coordinates on the gameboard
    static Coordinate[][] gameBoardCoordinates;
    Random random = new Random();



    // a constructor to construct ships
    public Ship(int shipSize, int xpos, int ypos, int alignment,Coordinate[][] gameBoardCoordinates){
        this.shipSize = shipSize;
        this.xpos = Gameboard.xpos[xpos];
        this.ypos = Gameboard.ypos[ypos];
        this.gameBoardCoordinates = gameBoardCoordinates;
        storeShipCoordinates();
    }
    //method to store ships Coordinates

    public  void storeShipCoordinates(){
        if (alignment == 1) {
            // for ship starting at xpos, xpos multiplied by ship size and yps
            for (int i = xpos; i < (xpos * shipSize); i++) {
                //add ship coordinates to coordinates on Game board
                shipCoordinates.add(gameBoardCoordinates[i][ypos]);
                //create connection from coordinates to teh specific ship
                gameBoardCoordinates[i][ypos].setOnCoordinate(this);
                //change has ship to true
                gameBoardCoordinates[i][ypos].setHasShip(true);
                //switch image for this ship
               gameBoardCoordinates[i][ypos].setCoordinateImageName("black.png");
            }
        }
        if(alignment == 2) {
            for (int i = ypos; i < (ypos * shipSize); i++) {
                shipCoordinates.add(gameBoardCoordinates[i][xpos]);
                gameBoardCoordinates[i][xpos].setOnCoordinate(this);
                gameBoardCoordinates[i][xpos].setHasShip(true);
                gameBoardCoordinates[i][xpos].setCoordinateImageName("black.png");
            }
        }
    }



    //Method to check if the ship is sunken
    public Boolean isSunken(){
        //sets sunken to true
        boolean sunken = true;
        // for all coordinates of the specific ship
        for (Coordinate coordinate : shipCoordinates){
            //if no coordinates are hit -  sets sunken to false
            if(!coordinate.getIsHit()){
                sunken = false;
            }
        }
        //otherwise returns true
        return true;
    }

}
