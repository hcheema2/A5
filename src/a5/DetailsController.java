package a5;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class DetailsController {
    @FXML
    Label labelBTC;
    @FXML
    Label labelETH;

    @FXML
    HBox BTChbox;

    @FXML
    HBox ETHhbox;


// the values of label present sent in initialize method
    public void initialize(){
        labelBTC.setText("$48,000.00");
        labelETH.setText("$1,832.00");
    }

    public DetailsController(){
        System.out.println("Constructor");

    }


    public void buttonClicked(MouseEvent mouseEvent) throws IOException {
        if(mouseEvent.getSource() == BTChbox){
            System.out.println("to BTC");
            Parent root = FXMLLoader.load(getClass().getResource("BTC.fxml"));
            Stage primaryStage = (Stage) BTChbox.getScene().getWindow();
            primaryStage.setScene(new Scene(root, 500, 500));
        }
        if(mouseEvent.getSource() == ETHhbox){
            System.out.println("to ETH");
            Parent root = FXMLLoader.load(getClass().getResource("ETH.fxml"));
            Stage primaryStage = (Stage) ETHhbox.getScene().getWindow();
            primaryStage.setScene(new Scene(root, 500, 500));
        }
    }


}
