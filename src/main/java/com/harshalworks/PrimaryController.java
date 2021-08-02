package com.harshalworks;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Hello World!");
        alert.showAndWait();
        App.setRoot("secondary");
    }
}
