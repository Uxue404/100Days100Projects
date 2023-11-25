module com.example.tointbinary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tointbinary to javafx.fxml;
    exports com.example.tointbinary;
}