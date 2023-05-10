module topsell.com.topsell {
    requires javafx.controls;
    requires javafx.fxml;


    opens topsell.com.topsell to javafx.fxml;
    exports topsell.com.topsell;
}