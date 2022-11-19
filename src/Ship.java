import com.sun.xml.internal.bind.v2.runtime.Coordinator;


import java.util.ArrayList;

public class Ship {
    //Kordinater av olika båtar
    //forslag
    private static Coordinate[][] firstCoordinate;
    private static Coordinate[][] secondCoordinate;
    private static Coordinate[][] thirdCoordinate;
    private static Coordinate[][] fourthCoordinate;
    private static Coordinate[][] fifthCoordinate;
    //en arraylist för att hålla koll på alla  koordinater
    ArrayList<Coordinate[][]> coordinatesArray = new ArrayList <Coordinate[][]>();
    private  String shipName = "";

    public  Ship (Coordinate[][] firstCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        coordinatesArray.add(firstCoordinate);
        shipName = "Patrol boat";
    }
    public Ship (Coordinate[][] firstCoordinate,Coordinate[][] secondCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        coordinatesArray.add(firstCoordinate);
        coordinatesArray.add(secondCoordinate);
        shipName = "Submarine";
    }
    public Ship (Coordinate[][] firstCoordinate,Coordinate[][] secondCoordinate,Coordinate[][] thirdCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        coordinatesArray.add(firstCoordinate);
        coordinatesArray.add(secondCoordinate);
        coordinatesArray.add(thirdCoordinate);
        shipName = "Cruiser";
    }
    public Ship (Coordinate[][] firstCoordinate, Coordinate[][] secondCoordinate, Coordinate[][] thirdCoordinate, Coordinate[][] fourthCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
        coordinatesArray.add(firstCoordinate);
        coordinatesArray.add(secondCoordinate);
        coordinatesArray.add(thirdCoordinate);
        coordinatesArray.add(fourthCoordinate);
        shipName = "Battleship";
    }
    public Ship (Coordinate[][] firstCoordinate,Coordinate[][] secondCoordinate,Coordinate[][] thirdCoordinate,Coordinate[][] fourthCoordinate,Coordinate[][] fifthCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
        this.fifthCoordinate = fifthCoordinate;
        coordinatesArray.add(firstCoordinate);
        coordinatesArray.add(secondCoordinate);
        coordinatesArray.add(thirdCoordinate);
        coordinatesArray.add(fourthCoordinate);
        coordinatesArray.add(fifthCoordinate);
        shipName = "Carrier";
    }

}
