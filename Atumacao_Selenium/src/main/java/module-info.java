module com.example.atumacao_selenium {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atumacao_selenium to javafx.fxml;
    exports com.example.atumacao_selenium;
}