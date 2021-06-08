import gui.Window;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class Die {
    @FXML
    public Button lobby;

    public void lobby(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/menu.fxml"));

        Scene scene = new Scene(root, 600, 400);
        Window.stage.setScene(scene);
        Window.stage.show();

    }
}
