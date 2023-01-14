package com.svalero.reloj;

import com.svalero.reloj.controller.AppController;
import com.svalero.reloj.util.R;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        // Interfaz para proramación de descargas en el tiempo.
        loader.setLocation(R.getUI("appMain.fxml"));
        // Quitar comentario para descarga desde fichero.
        //loader.setLocation(R.getUI("multidownload-2.fxml"));
        loader.setController(new AppController());
        AnchorPane root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Clock");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

