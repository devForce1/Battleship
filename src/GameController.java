import java.util.Scanner;

public class GameController{

    private enum ShotStatusT {h,m,s};
    public String init = "i shot ";
    public String hit = "h shot ";
    public String miss = "m shot ";
    public String gameOver = "game over";
    public String sunk = "s shot ";
    public static String client = "Client";
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    boolean start = false;
    String mode;
    private Gameboard gameboard;

    public boolean isGameOver(){
        return exit;
    }

    public String getCommand(){
        if(mode.equals(client)&& !start){
            start = true;
            saveLastCordinates("a", "1");
            return init + " a1";
        }

        String nextX = "a";
        String nextY = "1";

        // Get next coordinates from AI

        return nextCommand + " shot "+nextX+nextY;
    }

    public void setCommand(String command){
        System.out.println("New command reciverd: " + command);

        String first = command.substring(0,1);

        if(first.equals("i")){
            // Start game
            // Check new coordinate
            checkNewCoorinates(command);

        } else if (first.equals("h" )){
            // Last shot was hit
            // Mark last shot a hit
            markLastShot(ShotStatusT.h);

            // Check new coordinate
            checkNewCoorinates(command);

        } else if (first.equals("m" )) {
            // Last shot was miss

            // Mark shot a miss
            markLastShot(ShotStatusT.m);

            // Check new coordinate
            checkNewCoorinates(command);

        } else if (first.equals("s" )) {
            // Last shot sink ship

            // Mark shot a sink
            markLastShot(ShotStatusT.s);

            // Check new coordinate
            checkNewCoorinates(command);

        } else if (first.equals("g" )) {
            // Game over
            exit = true;
        }
    }

    private void markLastShot(ShotStatusT status) {
        // use lastX and lastY for display/AI

        if (status == ShotStatusT.m) {

        } else if (status == ShotStatusT.h) {

        } else if (status == ShotStatusT.s) {

        }
    }
    private void checkNewCoorinates(String command) {
        String x = command.substring(7,1);
        String y = command.substring(8,1);

        // Check the coordinates against own ships

        // Set nextCommand depending on result
        checkIfHit(x, y);
    }

    private void checkIfHit(String x, String y) {
    }

/*    public void checkIfHit(String x, String y) { // Gamecontroller

        //    if (gameboard.coordinates[x][y].isHasShip()) {
        //    } else gameview.gridImage[x][y].setImage(gameview.blueImage);
    }
    public void Shoot(String x, String y) {
        // Gamecontroller + kan ha updateImageview

        //gameview.coordinates[x][y].setIshit(true);
        checkIfHit(x, y);
    }
*/


}
