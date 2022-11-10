import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class ConfirmBox {

    static boolean yesNo;

    public static boolean display(String titel, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //Blocks from pressing outside the window
        window.setTitle(titel);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            yesNo = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            yesNo = false;
            window.close();
        });

        VBox vBox = new VBox(10);
        vBox.getChildren().add(label);
        vBox.getChildren().add(yesButton);
        vBox.getChildren().add(noButton);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.showAndWait();
        window.setResizable(false);

        return yesNo;
    }

}
