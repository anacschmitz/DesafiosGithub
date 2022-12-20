module com.example.exercicio01_map {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio01_map to javafx.fxml;
    exports com.example.exercicio01_map;
}