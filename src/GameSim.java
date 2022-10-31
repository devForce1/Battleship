
import java.util.Scanner;

public class GameSim {
    public String init = "i shot ";
    public String hit = "h shot ";
    public String miss = "m shot ";
    public String gameOver = "game over";
    public String sunk = "s shot ";
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    String mode;
    public GameSim(String mode){
        this.mode = mode;
    }

    public boolean isGameOver(){
        return exit;
    }

    public String getCommand(){

        //Tillfällig System.out
        //Test Command motsvarar Clientens första skott
        System.out.println(mode + " Test Command.");

        //Tillfällig scanner, ska ersättas med spelets input/output
        String testCommand = scanner.nextLine();
        if(testCommand.equals("Exit")){
            exit = true;
        }
        return testCommand;
    }

    public void setCommand(String command){
        System.out.println(mode + " " + command);
        if(command==null||command.equals(gameOver)){
            exit = true;
        }
    }
}
