package ua.net.maxx.actionregister;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ua.net.maxx.actionregister.db.LiquibaseSync;

import java.io.IOException;

public class ActionRegisterApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        LiquibaseSync.runLiquibase();
        FXMLLoader fxmlLoader = new FXMLLoader(ActionRegisterApp.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}