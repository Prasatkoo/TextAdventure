import gui.Window;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class Menu {


    @FXML
    public Button playbtn;
    @FXML
    public Button exitbtn;

    public void playAc(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/example.fxml"));

        Scene scene = new Scene(root, 600, 400);
        Window.stage.setScene(scene);

    }

    public void exitAc(ActionEvent actionEvent) {
        System.exit(0);
    }
}
