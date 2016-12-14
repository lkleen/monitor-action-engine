package de.steinberg.rpc.execution.trigger.ui;

import de.steinberg.rpc.execution.trigger.core.configuration.CoreConfiguration;
import de.steinberg.rpc.execution.trigger.core.engine.Engine;
import de.steinberg.rpc.execution.trigger.ui.configuration.UITestConfigruation;
import javafx.application.Application;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lkleen on 11/29/2016.
 */
@Slf4j
public class EngineUITest extends Application {

    public static void main(String... args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                CoreConfiguration.class,
                UITestConfigruation.class
        );
        EngineUI engineUI = applicationContext.getBean(EngineUI.class);
        Engine engine     = applicationContext.getBean(Engine.class);
        engineUI.initialize(engine, stage);
    }
}
