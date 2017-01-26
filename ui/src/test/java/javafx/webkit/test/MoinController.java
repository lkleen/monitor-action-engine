package javafx.webkit.test;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

/**
 * Created by lars on 26.01.2017.
 */
public class MoinController {

    @FXML
    Label label;

    @FXML
    public void initialize() {

        Glow glow = new Glow();
        glow.setLevel(0);
        label.setEffect(glow);
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        final KeyValue kv = new KeyValue(glow.levelProperty(), 0.8);
        final KeyFrame kf = new KeyFrame(Duration.millis(900), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();

        label.setId("red-glow");
    }

    public void mouseEntered(MouseEvent mouseEvent) {
        label.setId("green-glow");
    }

    public void mouseExited(MouseEvent mouseEvent) {
        label.setId("yellow-glow");
    }
}
