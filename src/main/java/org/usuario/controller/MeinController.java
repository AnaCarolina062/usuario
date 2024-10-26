package org.usuario.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MeinController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}