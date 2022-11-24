import org.ietf.jgss.GSSManager;

public class Coordinate {
    private char xcoordinate;
    private char ycoordinate;
    private boolean ishit; //
    private boolean hasShip; //
    private Ship onCoordinate;
    private String coordinateImageName;

    public Coordinate(char y, char x, boolean ishit, boolean hasShipOncoordinate, String coordinateImageName// Ship ship
                       ){
        this.xcoordinate = x;
        this.ycoordinate = y;
        this.ishit = ishit;
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
        this.ishit = ishit;
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


