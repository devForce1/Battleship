import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        GameSim gameSim = new GameSim(GameSim.client);

        try {
            Socket socket = new Socket("localhost", 9999);
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            boolean game = true;

            System.out.println("Client ready.");

            writer.println(gameSim.getCommand());

            while (!gameSim.isGameOver()) {
                gameSim.setCommand(reader.readLine());

                if(!gameSim.isGameOver()) {
                    writer.println(gameSim.getCommand());
                }
            }
            socket.close();
        }
        catch (Exception e ) {
            System.out.println("Game Input/Output error, Restart System.");
        }
    }
}