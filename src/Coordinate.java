import org.ietf.jgss.GSSManager;

public class Coordinate {
    private int x;
    private  int y;
    private int notAvailbleX;
    private int notNotAvailbleX2;
    private int notAvailbleY;
    private int notAvailibleY2;

    // This constructor was added by Alexandra
    public Coordinate (int x, int y){
        this.x = Gameboard.xpos[x];
        this.y = Gameboard.ypos[y];
    }
    //This constructor was added by Alexandra
    public Coordinate() {
        this.notAvailbleX = Gameboard.xpos[x];
        this.notNotAvailbleX2 = Gameboard.xpos[x];

        this.notAvailbleY = Gameboard.ypos[y];
        this.notAvailibleY2 = Gameboard.ypos[y];

    }
 // Added by Alexandra
    public int getX(){
        return this.x = Gameboard.xpos[x];
    }

    public int getY(){
        return this.y = Gameboard.ypos[y];
    }

    public boolean isEqual (Coordinate coordinate){
        if( this.x == coordinate.getX()& this.y == coordinate.getY()){
            return true;
        }return false;
    }

    // Class done by David

    // Setting up variables
    private char xcoordinate;
    private char ycoordinate;
    private boolean ishit; //
    private boolean hasShip; //
    private Ship onCoordinate;
    private String coordinateImageName;

    //Custom constructor
    public Coordinate(char y, char x, boolean ishit, boolean hasShipOncoordinate, String coordinateImageName// Ship ship
                       ){
        this.xcoordinate = x;
        this.ycoordinate = y;
        this.ishit = ishit;
        this.hasShip = hasShipOncoordinate;
        this.coordinateImageName = coordinateImageName;
    }

    //The idea here was to update the image on each GUI square/Image but the rest of the classes (Gamecontroller) but that never got completed
    public void updateCoordinateImage() {
        // Check if hit etc, and update Image + set property on the Image file name
    }

    //Geters and setters
    public String getCoordinateImageName() {
        return coordinateImageName;
    }

    public void setXcoordinate(char xcoordinate) {
        this.xcoordinate = xcoordinate;
    }

    public void setYcoordinate(char ycoordinate) {
        this.ycoordinate = ycoordinate;
    }

    public void setIshit(boolean ishit) {
        this.ishit = ishit;
    }

    public void setHasShip(boolean hasShip) {
        this.hasShip = hasShip;
    }

    public void setOnCoordinate(Ship onCoordinate) {
        this.onCoordinate = onCoordinate;
    }

    public void setCoordinateImageName(String coordinateImageName) {
        this.coordinateImageName = coordinateImageName;
    }

    public char getXcoordinate() {
        return this.xcoordinate;
    }

    public char getYcoordinate() {
        return this.ycoordinate;
    }

    public boolean ishit() {
        return ishit;
    }

    public boolean isHasShip() {
        return hasShip;
    }

    public Ship getOnCoordinate() {
        return onCoordinate;
    }




}


