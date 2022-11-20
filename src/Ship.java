import com.sun.xml.internal.bind.v2.runtime.Coordinator;


import java.util.ArrayList;

public class Ship {
    //Kordinater av olika båtar
    //forslag
    private static Coordinate firstCoordinate = null;
    private static Coordinate secondCoordinate = null;
    private static Coordinate thirdCoordinate = null;
    private static Coordinate fourthCoordinate = null;
    private static Coordinate fifthCoordinate = null;
    private  String shipName = "";
    //en arraylist för att hålla koll på alla  koordinater
    ArrayList<Coordinate> coordinatesArray = new ArrayList <Coordinate>();

    private  static  Coordinate unavalible = null;


    public Ship (Coordinate firstCoordinate,Coordinate secondCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        coordinatesArray.add(firstCoordinate);
        coordinatesArray.add(secondCoordinate);

    }
    public Ship (Coordinate firstCoordinate,Coordinate secondCoordinate,Coordinate thirdCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        coordinatesArray.add(firstCoordinate);
        coordinatesArray.add(secondCoordinate);
        coordinatesArray.add(thirdCoordinate);
    }
    public Ship (Coordinate firstCoordinate, Coordinate secondCoordinate, Coordinate thirdCoordinate, Coordinate fourthCoordinate, String shipName){
        this.firstCoordinate = firstCoordinate;
        this.secondCoordinate = secondCoordinate;
        this.thirdCoordinate = thirdCoordinate;
        this.fourthCoordinate = fourthCoordinate;
        coordinatesArray.add(firstCoordinate);
        coordinatesArray.add(secondCoordinate);
        coordinatesArray.add(thirdCoordinate);
        coordinatesArray.add(fourthCoordinate);
    }
    public Ship (Coordinate firstCoordinate, Coordinate secondCoordinate, Coordinate thirdCoordinate, Coordinate fourthCoordinate, Coordinate fifthCoordinate, String shipName){
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
    }
    //registers that a ship has been sucsesfully hit
    public  void shipHit(Coordinate coordinate){
        for(int i = 0; i < coordinatesArray.size(); i++)
        if(coordinatesArray.get(i).equals(coordinate)){
            System.out.println("Removed a coordinate from ships own array");
            //removes coordinate from the specific coordinate
            coordinatesArray.remove(i);
        }
    }
    public boolean noMoreCoordinates(){
        return coordinatesArray.isEmpty();
    }

    public boolean hasCoordinates(Coordinate coordinate){
        for(Coordinate coordinate1: coordinatesArray){
            if(coordinate1.isEqual(coordinate)){
                System.out.println("Ship.hasCoordinates(): true");
                return true;
            }
        }
        return false;
    }

}
