module com.example.lastproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lastproject to javafx.fxml;
    exports com.example.lastproject;
}