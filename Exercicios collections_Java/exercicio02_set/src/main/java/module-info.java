module com.example.exercicio02_set {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio02_set to javafx.fxml;
    exports com.example.exercicio02_set;
}