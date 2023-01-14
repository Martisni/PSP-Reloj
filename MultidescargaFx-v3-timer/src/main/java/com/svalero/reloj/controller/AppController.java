package com.svalero.reloj.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.svalero.reloj.task.ClockTask;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class AppController implements Initializable{

    @FXML
    private Label Label_clock;

    private ClockTask clockTask;

    public AppController() {
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        this.clockTask = new ClockTask();
        this.clockTask.messageProperty().addListener((a,b,c) -> Label_clock.setText(c));
        new Thread(this.clockTask).start();
        
    }
}
