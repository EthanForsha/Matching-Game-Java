import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

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
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}