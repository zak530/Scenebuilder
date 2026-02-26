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
    private Lista l;

    @FXML
    protected void somma(){
        Nodo n=new Nodo();

        tf.setText((Integer.parseInt(tf.getText())+10)+"");

    }
    @FXML
    protected void differenza(){
        tf.setText((Integer.parseInt(tf.getText())-10)+"");
    }
}
