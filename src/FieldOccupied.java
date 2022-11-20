public class FieldOccupied extends Throwable {
    Coordinate problemField;
    public  FieldOccupied(Coordinate coordinate, String msg){
        super(msg);
        problemField = coordinate;
    }

    public int getX(){
        return problemField.getX();
    }
    public int getY(){
        return problemField.getY();
    }

}
