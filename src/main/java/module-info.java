module com.example.prova1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prova1 to javafx.fxml;
    exports com.example.prova1;
}