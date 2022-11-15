public class FieldOccupied extends Throwable {
    Coordinate problemField;
    public  FieldOccupied(Coordinate coordinate, String msg){
        super(msg);
        problemField = coordinate;
    }

    public int getX(){
        return problemField.getXcoordinate();
    }
    public int getY(){
        return problemField.getYcoordinate();
    }

}
