package com.example.prova1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField tf;

    @FXML
    private TextArea areaRisultati;

    private Lista l;

    @FXML
    public void initialize() {
        l = new Lista();
        areaRisultati.setText("");
    }

    @FXML
    protected void somma() {

        int valoreCorrente = Integer.parseInt(tf.getText());
        int nuovoValore = valoreCorrente + 10;
        tf.setText(String.valueOf(nuovoValore));
        l.inserimentoInTesta(nuovoValore);
        areaRisultati.setText(l.stampaTutti());


    }

    @FXML
    protected void differenza() {
        int valoreCorrente = Integer.parseInt(tf.getText());
        int nuovoValore = valoreCorrente - 10;
        tf.setText(String.valueOf(nuovoValore));
        l.inserimentoInTesta(nuovoValore);
        areaRisultati.setText(l.stampaTutti());

    }
}