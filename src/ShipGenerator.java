import java.util.Random;

public class ShipGenerator {
    private static Ship ship;
    public void generateShips(Gameboard boardWithShips){

        Random random = new Random();

        int max = 9;

        //Generate Carrier


            Boolean generateCarrier = true;
            while (generateCarrier){
                //if direction = 0 add to  y coordinate, else add to x coordinate
                int direction = random.nextInt(2);
                int x = random.nextInt(5);
                int y = random.nextInt(5);
                Coordinate[][] firstCoordinate = new Coordinate[x][y];
                if(direction == 0){
                    Coordinate[][] secondCoordinate = new Coordinate[x][y+1];
                    Coordinate[][] thirdCoordinate = new Coordinate[x][y+1];
                    Coordinate[][] fourthCoordinate = new Coordinate[x][y+1];
                    Coordinate[][] fifthCoordinate = new Coordinate[x][y+1];
                    Ship carrier = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,fourthCoordinate, fifthCoordinate,"Carrier");
                }
                if(direction==1){
                    Coordinate[][] secondCoordinate = new Coordinate[x+1][y];
                    Coordinate[][] thirdCoordinate = new Coordinate[x+1][y];
                    Coordinate[][] fourthCoordinate = new Coordinate[x+1][y];
                    Coordinate[][] fifthCoordinate = new Coordinate[x+1][y];
                    ship = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,fourthCoordinate, fifthCoordinate,"Carrier");
                }
                if(Gameboard.canPlaceShip(ship)) {
                        try{
                        Gameboard.placeShip(ship);
                        generateCarrier = false;
                    }
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
            int x = random.nextInt(6);
            int y = random.nextInt(6);
            Coordinate[][] firstCoordinate = new Coordinate[x][y];
            if(direction == 0){
                Coordinate[][] secondCoordinate = new Coordinate[x][y+1];
                Coordinate[][] thirdCoordinate = new Coordinate[x][y+1];
                Coordinate[][] fourthCoordinate = new Coordinate[x][y+1];
                Ship BattleShip = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,fourthCoordinate,"BattleShip");
            }
            if(direction==1){
                Coordinate[][] secondCoordinate = new Coordinate[x+1][y];
                Coordinate[][] thirdCoordinate = new Coordinate[x+1][y];
                Coordinate[][] fourthCoordinate = new Coordinate[x+1][y];
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
            int x = random.nextInt(7);
            int y = random.nextInt(7);
            Coordinate[][] firstCoordinate = new Coordinate[x][y];
            if(direction == 0){
                Coordinate[][] secondCoordinate = new Coordinate[x][y+1];
                Coordinate[][] thirdCoordinate = new Coordinate[x][y+1];
                Ship Destroyer = new Ship(firstCoordinate,secondCoordinate,thirdCoordinate,"Destroyer");
            }
            if(direction==1){
                Coordinate[][] secondCoordinate = new Coordinate[x+1][y];
                Coordinate[][] thirdCoordinate = new Coordinate[x+1][y];
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
            int x = random.nextInt(8);
            int y = random.nextInt(8);
            Coordinate[][] firstCoordinate = new Coordinate[x][y];
            if(direction == 0){
                Coordinate[][] secondCoordinate = new Coordinate[x][y+1];
                Ship Submarine = new Ship(firstCoordinate,secondCoordinate,"Submarine");
            }
            if(direction==1){
                Coordinate[][] secondCoordinate = new Coordinate[x+1][y];
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
        Boolean generatePatrolBoat = true;
        while (generatePatrolBoat){
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            Coordinate[][] firstCoordinate = new Coordinate[x][y];
            ship = new Ship(firstCoordinate,"PatrolBoat");

            if(Gameboard.canPlaceShip(ship)) {
                try{
                    Gameboard.placeShip(ship);
                    generatePatrolBoat = false;
                }
                catch (FieldOccupied foe) {
                    System.out.println("An error occured: " + foe);
                    foe.printStackTrace();
                }
            }

        }

    }
}
