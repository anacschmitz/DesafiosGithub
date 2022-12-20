module com.example.exercicio02_listas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio02_listas to javafx.fxml;
    exports com.example.exercicio02_listas;
}