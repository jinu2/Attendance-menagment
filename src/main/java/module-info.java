module com.example.finalvy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalvy to javafx.fxml;
    exports com.example.finalvy;
}