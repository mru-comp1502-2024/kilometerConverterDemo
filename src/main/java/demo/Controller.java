package demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button convertButton;

    @FXML
    private TextField kilometerTextField;

    @FXML
    private Label outputLabel;

    public void initialize() {
        // perform any necessary initializations here
    }

    public void convertButtonHandler() {
        final double CONVERSION_FACTOR = 0.6214;

        // get the km value from the text field
        String km = kilometerTextField.getText();

        // convert to miles
        double miles = Double.parseDouble(km) * CONVERSION_FACTOR;

        // display result
        this.outputLabel.setText(km + "km is " + miles + "miles");
    }
}