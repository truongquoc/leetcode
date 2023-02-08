module com.example.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.solution.main to javafx.fxml;
    exports com.solution.main;
}