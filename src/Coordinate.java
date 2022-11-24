import org.ietf.jgss.GSSManager;

public class Coordinate {
    private int x;
    private  int y;
    private int notAvailbleX;
    private int notNotAvailbleX2;
    private int notAvailbleY;
    private int notAvailibleY2;

    public Coordinate (int x, int y){
        this.x = Gameboard.xpos[x];
        this.y = Gameboard.ypos[y];
    }

    public Coordinate() {
        this.notAvailbleX = Gameboard.xpos[x];
        this.notNotAvailbleX2 = Gameboard.xpos[x];

        this.notAvailbleY = Gameboard.ypos[y];
        this.notAvailibleY2 = Gameboard.ypos[y];

    }

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


    private char xcoordinate;
    private char ycoordinate;
    private boolean isHit; //
    private boolean hasShip; //
    private Ship onCoordinate;
    private String coordinateImageName;

    public Coordinate(char y, char x, boolean isHit, boolean hasShipOncoordinate, String coordinateImageName// Ship ship
                       ){
        this.xcoordinate = x;
        this.ycoordinate = y;
        this.isHit = isHit;
        this.hasShip = hasShipOncoordinate;
        this.coordinateImageName = coordinateImageName;
    }



    public void updateCoordinateImage() {
        // Check if hit etc, and update Image + set property on the Image file name
    }

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
        this.isHit = ishit;
    }
//Maybe we should take this aways since the functionality is in Gameboard - fieldstatus
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

    public boolean getIsHit() {
        return isHit;
    }

    public boolean isHasShip() {
        return hasShip;
    }

    public Ship getOnCoordinate() {
        return onCoordinate;
    }




}


