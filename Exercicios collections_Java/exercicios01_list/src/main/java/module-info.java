module com.example.exercicios01_list {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.exercicios01_list to javafx.fxml;
    exports br.com.exercicios01_list;
}