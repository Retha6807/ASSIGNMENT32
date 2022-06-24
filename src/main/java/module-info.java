module com.example.assignment32 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment32 to javafx.fxml;
    exports com.example.assignment32;
    exports com.example.assigment32;
    opens com.example.assigment32 to javafx.fxml;
}