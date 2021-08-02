module com.harshalworks {
    requires javafx.controls;
    requires com.jfoenix;
    requires javafx.fxml;

    opens com.harshalworks to javafx.fxml;
    exports com.harshalworks;
}