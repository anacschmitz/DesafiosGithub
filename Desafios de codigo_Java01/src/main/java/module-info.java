module com.example.dio_bootcamp {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.dio_bootcamp to javafx.fxml;
    exports br.com.dio_bootcamp;
}