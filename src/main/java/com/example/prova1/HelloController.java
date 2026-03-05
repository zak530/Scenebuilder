package com.example.prova1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    protected Label welcomeText;

    @FXML
    protected TextField tf;

    @FXML
    protected TextArea areaRisultati;

    private Lista l;


    @FXML
    Lista li =new Lista();


    @FXML
    protected void somma() {

        int valoreCorrente = Integer.parseInt(tf.getText());
        int nuovoValore = valoreCorrente + 10;
        tf.setText(String.valueOf(nuovoValore));
        li.inserimentoInTesta(nuovoValore);
        areaRisultati.setText(String.valueOf(nuovoValore));


    }

    @FXML
    protected void differenza() {
        int valoreCorrente = Integer.parseInt(tf.getText());
        int nuovoValore = valoreCorrente - 10;
        tf.setText(String.valueOf(nuovoValore));
        li.inserimentoInTesta(nuovoValore);
        areaRisultati.setText(String.valueOf(nuovoValore));

    }

    @FXML
    protected void moltiplica() {

        int valoreCorrente = Integer.parseInt(tf.getText());
        int nuovoValore = valoreCorrente * 10;
        tf.setText(String.valueOf(nuovoValore));
        l.inserimentoInTesta(nuovoValore);
        areaRisultati.setText(String.valueOf(nuovoValore));

    }


}