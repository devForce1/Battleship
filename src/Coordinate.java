import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinate {
    private char xcoordinate;
    private char ycoordinate;
    private boolean ishit; //
    private boolean hasShip; //
//    private Ships onCoordinate;
    private String coordinateImageName;

    public Coordinate(char y, char x, boolean ishit, boolean hasShipOncoordinate, String coordinateImageName)/*, Ship ship)*/ {
        this.xcoordinate = x;
        this.ycoordinate = x;
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
        return xcoordinate;
    }

    public char getYcoordinate() {
        return ycoordinate;
    }

    public boolean isIshit() {
        return ishit;
    }

    public boolean isHasShip() {
        return hasShip;
    }

    public Ship getOnCoordinate() {
        return onCoordinate;
    }
}


