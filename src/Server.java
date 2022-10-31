import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server{
    public static void main(String[] args){
        GameSim gameSim = new GameSim("Server");

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

            while (!gameSim.isGameOver()) {
                gameSim.setCommand(reader.readLine());

                if (!gameSim.isGameOver()) {
                    writer.println(gameSim.getCommand());
                }
            }
            socket.close();
        }
        catch (IOException e){
            System.out.println("Game Input/Output error, Restart System.");
        }
    }
}