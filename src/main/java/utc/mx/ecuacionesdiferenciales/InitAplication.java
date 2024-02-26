package utc.mx.ecuacionesdiferenciales;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static utc.mx.ecuacionesdiferenciales.ViewSwitcher.setScene;
import static utc.mx.ecuacionesdiferenciales.ViewSwitcher.switchTo;

public class InitAplication extends Application {
    @Override
    public void start(Stage stage) {
        var scene = new Scene(new Pane());

        setScene(scene);
        switchTo(Views.Selection);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}