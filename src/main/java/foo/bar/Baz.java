package foo.bar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class Baz extends Application {
    @Override
    public void start(Stage ps) {
        Button btn = new Button("Close");
        btn.setOnAction(e -> ps.close());
        ps.setScene(new Scene(new StackPane(btn)));
        ps.show();
    }
}