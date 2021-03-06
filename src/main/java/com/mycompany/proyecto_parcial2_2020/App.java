package com.mycompany.proyecto_parcial2_2020;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    //1. RUTA ARCHIVOO PARA PODER LEER LAS IMAGENES
    public static String pathimagenes = "Imagenes/";
    //1.1 RUTA PARA E ARCHIVO QUE COTIENE EL NUMERO Y NOMBRE DE LAS CARTAS
    public static String pathArchivo = "cartasloteria.csv";
    //1.2 RUTA PARA EL ARCHIVO QUE CONTIENE LA CONFIGURACION DEL JEUGO
    public static String pathDatos = "visibilidad.ser";
    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}