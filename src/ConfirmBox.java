import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class ConfirmBox {

    // Robin Andersson har gjort denna kod
    static boolean yesNo;

    public static boolean display(String titel, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //Gör så man inte kan trycka utanför fönstret
        window.setTitle(titel); // Namnet på fönsret
        window.setMinWidth(250); // Storlek på fönstret
        Label label = new Label(); // Gör så att man kan sätta ett text
        label.setText(message); // Texten man vill ha i fönstret

        // Gör knapparna
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

       // Funktionen till knapparna. Stänger ner detta fönster efter val
        yesButton.setOnAction(e -> {
            yesNo = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            yesNo = false;
            window.close();
        });

        // Skapar fönstret och sätter knapparna och texten
        VBox vBox = new VBox(10);
        vBox.getChildren().add(label);
        vBox.getChildren().add(yesButton);
        vBox.getChildren().add(noButton);
        vBox.setAlignment(Pos.CENTER); // Sätter position för knapparna
        Scene scene = new Scene(vBox); // Gör fönstret och sätter in vBoxen i fönstret
        window.setScene(scene); // Sätter in scenen i fönstret
        window.showAndWait();
        window.setResizable(false); // Gör så man inte kan ändra storlek på fönstret

        return yesNo;
    }

}
