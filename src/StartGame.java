import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class StartGame {

    static boolean startServer;

    public static boolean display(String titel, String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL); //Blocks from pressing outside the window
        window.setTitle(titel);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button serverButton = new Button("Server");
        Button clientButton = new Button("Client");

        serverButton.setOnAction(e -> {

        });

        clientButton.setOnAction(e -> {

        });

        VBox vBox = new VBox(10);
        vBox.getChildren().add(label);
        vBox.getChildren().add(serverButton);
        vBox.getChildren().add(clientButton);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.showAndWait();


        return startServer;
    }
}
