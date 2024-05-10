package it.jose.controller;

import java.io.IOException;

import it.jose.App;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class PrimaryController {

    @FXML
    private Label messaggio;

    @FXML
    private RadioButton botAttivo;

    @FXML
    private ToggleGroup numeroGiocatori;

    @FXML
    private void switchToSecondary() throws IOException {
        RadioButton r = (RadioButton) numeroGiocatori.getSelectedToggle();
        if (r == null) {
            messaggio.setText("prima inserire il \nnumero di giocatori");
        } else {
            if (botAttivo.isSelected()) {
                App.setRoot("secondary");

            } else {
                App.setRoot("tertiary");
            }
        }

    }
}
