module com.example.desafiosjava_intermediario {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.example.desafios to javafx.fxml;
    exports br.com.example.desafios;
}