package com.example.tointbinary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnCalcular;

    @FXML
    private Label mostrarResultado;

    @FXML
    private TextField textBinary;
    private int binary;

    @FXML
    protected void onHelloButtonClick() {
        String newBinary = textBinary.getText();
        try{
            binary = Integer.parseInt(newBinary);
            mostrarResultado.setText(Integer.toBinaryString(binary));
        }catch (NumberFormatException e){
            System.out.println("Numero no valido");
            mostrarAlerta("Error","Ingresa un numero decimal valido");
        }
    }

    @FXML
    void botonLimpiar(ActionEvent event) {
        limpiar();
    }

    private void mostrarAlerta(String title, String message){
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle(title);
        alerta.setContentText(message);
        alerta.showAndWait();
    }

    private void limpiar (){
        textBinary.clear();
        mostrarResultado.setText("");
    }
}