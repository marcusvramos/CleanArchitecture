module com.example.cleanarchitecture {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cleanarchitecture to javafx.fxml;
    exports com.example.cleanarchitecture;
}