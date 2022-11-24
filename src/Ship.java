import com.sun.xml.internal.bind.v2.runtime.Coordinator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    int shipSize;
    int xpos;
    int ypos;

    private List<Coordinate> shipCoordinates = new ArrayList<>();
    private  Coordinate[][] gameBoardCoordinates;
    Random random = new Random();
    int alignment = random.nextInt(2);

    public Ship(int shipSize, int alignment, int xpos, int ypos, Coordinate[][]gameBoardCoordinates){
        this.shipSize = shipSize;
        this.xpos = xpos;
        this.ypos = ypos;
        this.alignment = alignment;
        this.gameBoardCoordinates = gameBoardCoordinates;
        storeShipCoordinates();
    }

    public  void storeShipCoordinates(){
        if ( alignment == 0){
            for(int i = xpos; i < (xpos*shipSize); i++){
                shipCoordinates.add(gameBoardCoordinates[i][ypos]);
                gameBoardCoordinates[i][ypos].setShipHere(this);
                gameBoardCoordinates[i][ypos].setHasShip(true);
                gameBoardCoordinates[i][ypos].changeImage();
            }
        }
        if (alignment == 1){
            for(int i = ypos; i < (ypos*shipSize); i++){
                shipCoordinates.add(gameBoardCoordinates[i][xpos]);
                gameBoardCoordinates[i][xpos].setShipHere(this);
                gameBoardCoordinates[i][xpos].setHasShip(true);
                gameBoardCoordinates[i][xpos].changeImage();
            }
        }
    }

    public Boolean isSunken(){
        boolean sunken = true;
        for (Coordinate coordinate : shipCoordinates){
            if(!coordinate.getIsHit()){
                sunken = false;
            }
        }
        return true;
    }


}
