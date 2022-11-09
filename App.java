import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        ButtonGrid buttons = new ButtonGrid();
        GridPane gPane = buttons.getGridPane();
        BorderPane bPane = new BorderPane();
        bPane.setCenter(gPane);
        HBox hBox = new HBox();
        Label label = new Label();
        label.setText("Time Elapsed: 0 seconds");
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(label);
        label.setAlignment(Pos.CENTER);
        bPane.setBottom(hBox);
        Scene scene = new Scene(bPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setTitle("Matching Game!");
        final Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            int count = 0;
            @Override
            public void handle(ActionEvent event) {
                count++;
                label.setText("Time Elapsed: " + count + " seconds");    
            }
       }));
       timeline.setCycleCount(Timeline.INDEFINITE);
       timeline.play();
       if (buttons.isFinished()){
        timeline.stop();
       }
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}