import javafx.stage.Stage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class GameController{

    public Gameview gameview;
    public enum ModeT {Client, Server};
    private enum ShotStatusT {hit,miss,sunk};
    public String init = "i shot ";
    public String hit = "h shot ";
    public String miss = "m shot ";
    public String gameOver = "game over";
    public String sunk = "s shot ";
    private Gameboard gameboard;
    public static String client = "Client";
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    boolean start = false;
    ModeT mode = null;
    String lastX;
    String lastY;
    String nextCommand;
    public GameController(){
         gameboard = new Gameboard();
    }

    public void setMode(ModeT mode) {
        this.mode = mode;
        if (mode == ModeT.Client) {
            try {
                Socket socket = new Socket("localhost", 9999);
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                boolean game = true;

                System.out.println("Client ready.");

                writer.println(getCommand());

                while (!isGameOver()) {
                    setCommand(reader.readLine());

                    if(!isGameOver()) {
                        writer.println(getCommand());
                    }
                }
                socket.close();
            }
            catch (Exception e ) {
                System.out.println("Game Input/Output error, Restart System.");
            }

        } else if (mode == ModeT.Server) {
            try (ServerSocket serverSocket = new ServerSocket(9999)){
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                PrintWriter writer = new PrintWriter(outputStream, true);
                System.out.println("Server ready.");

                String gameInput = "";
                String gameOutput = "";

                boolean allShipsNotSunk = true;
                Scanner scanner = new Scanner(System.in);

                while (!isGameOver()) {
                    setCommand(reader.readLine());

                    if (!isGameOver()) {
                        writer.println(getCommand());
                    }
                }
                socket.close();
            }
            catch (IOException e){
                System.out.println("Game Input/Output error, Restart System.");
            }

        } else {
            System.out.println("Error unkown mode");
        }
    }
    public void createGameview(Stage stage) {
        gameview = new Gameview(this, stage);
    }
    private void saveLastCordinates(String x, String y) {
        lastX = x;
        lastY = y;
    }
    public boolean isGameOver(){
        return exit;
    }
    public String getCommand(){
        if(mode==ModeT.Client && !start){
            start = true;
            saveLastCordinates("a", "1");
            return init + "a1";
        }
        String nextX = "a";
        String nextY = "1";
        // Get next coordinates from AI
        return nextCommand + " shot "+nextX+nextY;
    }
    public void setCommand(String command){
        System.out.println("New command received: " + command);
        String first = command.substring(0,1);
        if(first.equals("i")){
            // Start game
            // Check new coordinate
            checkNewCoorinates(command);
        } else if (first.equals("h" )){
            // Last shot was hit
            // Mark last shot a hit
            markLastShot(ShotStatusT.hit);
            // Check new coordinate
            checkNewCoorinates(command);
        } else if (first.equals("m" )) {
            // Last shot was miss
            // Mark shot a miss
            markLastShot(ShotStatusT.miss);
            // Check new coordinate
            checkNewCoorinates(command);
        } else if (first.equals("s" )) {
            // Last shot sink ship
            // Mark shot a sink
            markLastShot(ShotStatusT.sunk);
            // Check new coordinate
            checkNewCoorinates(command);
        } else if (first.equals("g" )) {
            // Game over
            exit = true;
        }
    }

    public void checkIfHit(char x, char y) { // Gamecontroller
    }

    private void markLastShot(ShotStatusT status) {
        // use lastX and lastY for display/AI
        if (status == ShotStatusT.miss) {

        } else if (status == ShotStatusT.hit) {

        } else if (status == ShotStatusT.sunk) {
        }
    }
    private void checkNewCoorinates(String command) {
        System.out.println(":"+command+":"+command.length());
        String x = command.substring(7, 8);
        String y = command.substring(8);
        // Check the coordinates against own ships
        // Set nextCommand depending on result
//        checkIfHit(x, y);
    }

}

//    private void checkIfHit(String x, String y) {
//    }

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