package de.steinberg.rpc.execution.trigger.ui;

import de.steinberg.rpc.execution.trigger.core.engine.Engine;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.inject.Inject;
import java.net.URL;

/**
 * Created by lkleen on 11/29/2016.
 */
public class EngineUI {

    @Inject
    ComboBoxSetup comboBoxSetup;

    public void initialize(Engine engine, Stage stage) throws Exception {
        URL resource = getClass().getClassLoader().getSystemResource("ui.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root, 300, 275);

        ComboBox selectMonitor = (ComboBox) scene.lookup("#selectMonitor");
        Pane monitorSettings = (Pane) scene.lookup("#monitorSettings");
        comboBoxSetup.setup(engine.getMonitors(), selectMonitor);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

}
