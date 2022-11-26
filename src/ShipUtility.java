public class ShipUtility {
    public static void createEnemyShips(){
        Ship a = new Ship(5,1,1,1,Ship.gameBoardCoordinates);
        Ship b = new Ship(4,7,1,2,Ship.gameBoardCoordinates);
        Ship c = new Ship(4,5,9,1,Ship.gameBoardCoordinates);
        Ship d = new Ship(3,1,6,1,Ship.gameBoardCoordinates);
        Ship e = new Ship(3,2,8,2,Ship.gameBoardCoordinates);
        Ship f = new Ship(3,8,7,1,Ship.gameBoardCoordinates);
        Ship g = new Ship(2,2,3,2,Ship.gameBoardCoordinates);
        Ship h = new Ship(2,4,3,1,Ship.gameBoardCoordinates);
        Ship o = new Ship(2,5,6,2,Ship.gameBoardCoordinates);
        Ship p = new Ship(2,8,4,2,Ship.gameBoardCoordinates);

    }
    //yes they are practically copies of eachouthers. Dont have time for fancy placements
    public static void createPlayerShips(){
        Ship a = new Ship(5,1,1,2,Ship.gameBoardCoordinates);
        Ship b = new Ship(4,7,1,1,Ship.gameBoardCoordinates);
        Ship c = new Ship(4,5,9,2,Ship.gameBoardCoordinates);
        Ship d = new Ship(3,1,6,2,Ship.gameBoardCoordinates);
        Ship e = new Ship(3,2,8,1,Ship.gameBoardCoordinates);
        Ship f = new Ship(3,8,7,2,Ship.gameBoardCoordinates);
        Ship g = new Ship(2,2,3,1,Ship.gameBoardCoordinates);
        Ship h = new Ship(2,4,3,2,Ship.gameBoardCoordinates);
        Ship o = new Ship(2,5,6,1,Ship.gameBoardCoordinates);
        Ship p = new Ship(2,8,4,1,Ship.gameBoardCoordinates);
    }
}
