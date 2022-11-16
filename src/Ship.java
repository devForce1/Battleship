import com.sun.xml.internal.bind.v2.runtime.Coordinator;

public class Ship {
    //Kordinater av olika båtar
    //forslag
    private static Coordinate firstCoordinate = null;
    private static Coordinate secondCoordinate = null;
    private static Coordinate thirdCoordinate = null;
    private static Coordinate fourthCoordinate =  null;
    private static Coordinate fifthCoordinate = null;
    //en arraylist för att hålla koll på alla  koordinater
    ArrayList<Coordinate> coordinates = new ArrayList <Coordinate> ();
    private  String shipName = "";

    public  Ship (firstCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        Coordinate.add(firstCoordinate);
        shipName = "Patrol boat";
    }
    public Ship (firstCoordinate, secondCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        Coordinate.add(firstCoordinate);
        Coordinate.add(secondCoordinate);
        shipName = "Submarine";
    }
    public Ship (firstCoordinate, secondCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        Coordinate.add(firstCoordinate);
        Coordinate.add(secondCoordinate);
        shipName = "Submarine";
    }
    public Ship (firstCoordinate, secondCoordinate, thirdCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        Coordinate.add(firstCoordinate);
        Coordinate.add(secondCoordinate);
        Coordinate.add(thirdCoordinate);
        shipName = "Cruiser";
    }
    public Ship (firstCoordinate, secondCoordinate, thirdCoordinate, fourthCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
        Coordinate.add(firstCoordinate);
        Coordinate.add(secondCoordinate);
        Coordinate.add(thirdCoordinate);
        Coordinate.add(fourthCoordinate);
        shipName = "Battleship";
    }
    public Ship (firstCoordinate, secondCoordinate, thirdCoordinate, fourthCoordinate, fifthCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
        this.fifthCoordinate = fifthCoordinate;
        Coordinate.add(firstCoordinate);
        Coordinate.add(secondCoordinate);
        Coordinate.add(thirdCoordinate);
        Coordinate.add(fourthCoordinate);
        Coordinate.add(fifthCoordinate);
        shipName = "Carrier";
    }

}
