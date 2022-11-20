import java.util.Random;

public class ShipGenerator {
    private static Ship ship;
    int max = 10;
    public void generateShips(Gameboard boardWithShips){

        Random random = new Random();

        //Generate Carrier


            Boolean generateCarrier = true;
            while (generateCarrier){
                //if direction = 0 add to  y coordinate the boat will be placed horizontaly
                //else add to x coordinate, the boat will be placed vertivally
                int direction = random.nextInt(2);
                //bound because i decided to not create a method to check if the suggested coordinate is on the board
                int x = random.nextInt(max);
                int y = random.nextInt(max);
                //x och y is index of value within the boardgame array
                Coordinate firstCoordinate = new Coordinate(x, y); //should somehow add to the array x-1, y-1 and y+1
                if(direction == 0){
                    Coordinate secondCoordinate = new Coordinate(x, y+1); //should somehow add to the array  y and y+2
                    Coordinate thirdCoordinate = new Coordinate(x, y+1);
                    Coordinate fourthCoordinate = new Coordinate(x, y+1);
                    Coordinate fifthCoordinate = new Coordinate(x, y+1);
                    //using a constructor from ship class creating a boat
                    Ship carrier = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,fourthCoordinate, fifthCoordinate,"Carrier");
                }
                if(direction==1){
                    Coordinate secondCoordinate = new Coordinate(x, y+1);
                    Coordinate thirdCoordinate = new Coordinate(x, y+1);
                    Coordinate fourthCoordinate = new Coordinate(x, y+1);
                    Coordinate fifthCoordinate = new Coordinate(x, y+1);
                    ship = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,fourthCoordinate, fifthCoordinate,"Carrier");
                }
                //using a method from gameboard shecking if suggested position is empty
                if(Gameboard.canPlaceShip(ship)) {
                        try{
                        Gameboard.placeShip(ship);
                        generateCarrier = false;
                    }
                // if ship can not be placed loopi
                         catch (FieldOccupied foe) {
                        System.out.println("An error occured: " + foe);
                             foe.printStackTrace();
                    }
                }

            }
        Boolean generateBattleship = true;
        while (generateBattleship){
            //if direction = 0 add to  y coordinate, else add to x coordinate
            int direction = random.nextInt(2);
            int x = random.nextInt(max);
            int y = random.nextInt(max);
            Coordinate firstCoordinate = new Coordinate(x, y);
            if(direction == 0){
                Coordinate secondCoordinate = new Coordinate(x, y+1);
                Coordinate thirdCoordinate = new Coordinate(x, y+1);
                Coordinate fourthCoordinate = new Coordinate(x, y+1);
                Ship BattleShip = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,fourthCoordinate,"BattleShip");
            }
            if(direction==1){
                Coordinate secondCoordinate = new Coordinate(x, y+1);
                Coordinate thirdCoordinate = new Coordinate(x, y+1);
                Coordinate fourthCoordinate = new Coordinate(x, y+1);
                ship = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,fourthCoordinate,"BattleShip");
            }
            if(Gameboard.canPlaceShip(ship)) {
                try{
                    Gameboard.placeShip(ship);
                    generateBattleship = false;
                }
                catch (FieldOccupied foe) {
                    System.out.println("An error occured: " + foe);
                    foe.printStackTrace();
                }
            }

        }
        Boolean generateDestroyer = true;
        while (generateDestroyer){
            //if direction = 0 add to  y coordinate, else add to x coordinate
            int direction = random.nextInt(2);
            int x = random.nextInt(max);
            int y = random.nextInt(max);
            Coordinate firstCoordinate = new Coordinate(x, y);
            if(direction == 0){
                Coordinate secondCoordinate = new Coordinate(x, y+1);
                Coordinate thirdCoordinate = new Coordinate(x, y+1);
                Ship Destroyer = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,"Destroyer");
            }
            if(direction==1){
                Coordinate secondCoordinate = new Coordinate(x, y+1);
                Coordinate thirdCoordinate = new Coordinate(x, y+1);
                ship = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,"Destroyer");
            }
            if(Gameboard.canPlaceShip(ship)) {
                try{
                    Gameboard.placeShip(ship);
                    generateDestroyer = false;
                }
                catch (FieldOccupied foe) {
                    System.out.println("An error occured: " + foe);
                    foe.printStackTrace();
                }
            }

        }
        Boolean generateSubmarine = true;
        while (generateSubmarine){
            //if direction = 0 add to  y coordinate, else add to x coordinate
            int direction = random.nextInt(2);
            int x = random.nextInt(max);
            int y = random.nextInt(max);
            Coordinate firstCoordinate = new Coordinate(x, y);
            if(direction == 0){
                Coordinate secondCoordinate = new Coordinate(x, y+1);
                Ship Submarine = new Ship(firstCoordinate,secondCoordinate,"Submarine");
            }
            if(direction==1){
                Coordinate secondCoordinate = new Coordinate(x, y+1);
                ship = new Ship(firstCoordinate,secondCoordinate,"Submarine");
            }
            if(Gameboard.canPlaceShip(ship)) {
                try{
                    Gameboard.placeShip(ship);
                    generateSubmarine = false;
                }
                catch (FieldOccupied foe) {
                    System.out.println("An error occured: " + foe);
                    foe.printStackTrace();
                }
            }

        }

    }
}
