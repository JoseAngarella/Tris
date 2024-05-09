package it.jose.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import it.jose.App;
import it.jose.model.Campo;
import it.jose.model.Costants;
import it.jose.model.Partita;
import it.jose.model.PartitaService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecondaryController implements Initializable {

    @FXML
    private Label labelTurno;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        PartitaService.setP(new Partita(new Campo(), Costants.letteraGiocatoreO));
        setLabelTurno();
    }

    @FXML
    public void setLabelTurno() {
        labelTurno.setText("Turno giocatore " + PartitaService.getP().getGiocareTurno());
    }

    @FXML
    private void casellaCliccata(ActionEvent event) {
        if (PartitaService.getP().getVincitore() == ' ') {
            Button btn = (Button) event.getTarget();
            if (PartitaService.casellaSelezionata(GridPane.getColumnIndex(btn),
                    GridPane.getRowIndex(btn))) {
                btn.setText("" + PartitaService.getP().getGiocareTurno());
            }
            if (PartitaService.controllaSeVittoria(PartitaService.getP().getGiocareTurno())) {
                vittoria();
            } else {
                cambioTurno();
            }
        }
    }

    @FXML
    private void vittoria() {
        labelTurno.setText("Vincitore della partita: " + PartitaService.getP().getGiocareTurno());

    }

    @FXML
    private void cambioTurno() {
        if (PartitaService.controllaSePartitaPuoContinuare()) {
            if (PartitaService.getP().getGiocareTurno() == Costants.letteraGiocatoreO) {
                PartitaService.getP().setGiocareTurno(Costants.letteraGiocatoreX);
            } else {
                PartitaService.getP().setGiocareTurno(Costants.letteraGiocatoreO);
            }
            setLabelTurno();
        } else {
            labelTurno.setText("Nessun Vincitore");
        }

    }

}