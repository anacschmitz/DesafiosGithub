module com.example.cursomockito {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.dio.mockito to javafx.fxml;
    exports br.com.dio.mockito;
}