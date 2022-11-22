import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args){
        GameController gameController = new GameController();

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

            while (!gameController.isGameOver()) {
                gameController.setCommand(reader.readLine());

                if (!gameController.isGameOver()) {
                    writer.println(gameController.getCommand());
                }
            }
            socket.close();
        }
        catch (IOException e){
            System.out.println("Game Input/Output error, Restart System.");
        }
    }

}