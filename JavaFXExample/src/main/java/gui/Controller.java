package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.text.Text;

import java.io.IOException;

public class Controller {
    private int count = 0;
    private int countf = 0;

    @FXML
    public Button left;
    @FXML
    public Button Forward;
    @FXML
    public Button right;
    @FXML
    public Label textarea;
    @FXML
    public Text header;

    public void leftAction(ActionEvent actionEvent) throws IOException {
        count++;
        if (count == 0){
            Room1 room1 = new Room1();
            room1.setTitle("TOVERN");
            header.setText(room1.getTitle());
            textarea.setText("Wassup Traveler :). Welcome here and enjoy your trip XD");
        }

        if (count == 1) {
            Room1 room1 = new Room1();
            room1.setTitle("Parkour Room");
            room1.setArea("Jump acroos to your left \n" +
                    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. \n" +
                    " Etiam sapien elit, consequat eget, tristique non, venenatis quis, ante.\n" +
                    " Vivamus ac leo pretium faucibus. Aliquam in lorem sit amet leo accumsan lacinia.\n " +
                    "Vivamus porttitor turpis ac leo. Integer malesuada. Sed ac dolor sit amet purus malesuada congue. ");
            textarea.setText(room1.getArea());
            header.setText(room1.getTitle());
        } else if (count == 2) {
            right.setDisable(true);
            Forward.setDisable(true);
            header.setText("Sex Dungeon");
            textarea.setText("You can't run now :) \n" +
                    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. \n" +
                    " Etiam sapien elit, consequat eget, tristique non, venenatis quis, ante.\n" +
                    " Vivamus ac leo pretium faucibus.\n " +
                    "Aliquam in lorem sit amet leo accumsan lacinia.\n " +
                    "Vivamus porttitor turpis ac leo. Integer malesuada.\n" +
                    " Sed ac dolor sit amet purus malesuada congue.");

        } else if (count == 3) {
            Parent root = FXMLLoader.load(getClass().getResource("/die.fxml"));
            Scene scene = new Scene(root, 600, 400);
            Window.stage.setScene(scene);
            Window.stage.show();
        }

    }

    public void forwardAction(ActionEvent actionEvent) throws IOException {
        countf++;
        if (countf == 1) {
            Room1 room1 = new Room1();
            room1.setTitle("Stairs to Heaven");
            room1.setArea("The Stairs are sooo long \n" +
                    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. \n" +
                    " Etiam sapien elit, consequat eget, tristique non, venenatis quis, ante.\n" +
                    " Vivamus ac leo pretium faucibus. Aliquam in lorem sit amet leo accumsan lacinia.\n " +
                    "Vivamus porttitor turpis ac leo. Integer malesuada. Sed ac dolor sit amet purus malesuada congue.");

            textarea.setText(room1.getArea());
            header.setText(room1.getTitle());

        }
      else if (countf == 2) {
            left.setDisable(true);
            right.setDisable(true);
            Room1 room1 = new Room1();
            room1.setTitle("Gates to Heaven");
            room1.setArea("If you wanna enter go forward!");
            header.setText(room1.getTitle());
            textarea.setText(room1.getArea());
        }
       else if (countf == 3) {
            left.setDisable(true);
            right.setDisable(true);
            header.setText("Heaven");

            Parent root = FXMLLoader.load(getClass().getResource("/win.fxml"));
            Scene scene = new Scene(root, 600, 400);
            Window.stage.setScene(scene);
            Window.stage.show();
        }
    }

    public void rightAction(ActionEvent actionEvent) throws IOException {
        count--;
        if (count == -1) {
            Room1 room1 = new Room1();
            room1.setTitle("Weird stairs");
            room1.setArea("Just some weird stairs on your right \n" +
                    "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. \n" +
                    " Etiam sapien elit, consequat eget, tristique non, venenatis quis, ante.\n" +
                    " Vivamus ac leo pretium faucibus. Aliquam in lorem sit amet leo accumsan lacinia.\n "
                    + "Vivamus porttitor turpis ac leo. Integer malesuada. Sed ac dolor sit amet purus malesuada congue.");
            textarea.setText(room1.getArea());
            header.setText(room1.getTitle());
        }
        else if (count == -2) {
            Room1 room1 = new Room1();
            room1.setTitle("Hell");
            room1.setArea("Gates to hell. There is no way back \n" + "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. \n" +
                    " Etiam sapien elit, consequat eget, tristique non, venenatis quis, ante.\n" +
                    " Vivamus ac leo pretium faucibus. Aliquam in lorem sit amet leo accumsan lacinia.\n "
                    + "Vivamus porttitor turpis ac leo. Integer malesuada. Sed ac dolor sit amet purus malesuada congue.");
            textarea.setText(room1.getArea());
            header.setText(room1.getTitle());
         left.setDisable(true);
         Forward.setDisable(true);
        }
       else if (count == -3){
            Parent root = FXMLLoader.load(getClass().getResource("/die.fxml"));
            Scene scene = new Scene(root, 600, 400);
            Window.stage.setScene(scene);
            Window.stage.show();
        }
    }
}



