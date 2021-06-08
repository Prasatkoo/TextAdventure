import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Win {
    @FXML
    public Button wonex;

    public void won(ActionEvent actionEvent) {
        System.exit(0);
    }
}
