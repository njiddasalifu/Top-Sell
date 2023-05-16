module com.topsell.topsell {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.topsell.topsell to javafx.fxml;
    exports com.topsell.topsell;
}