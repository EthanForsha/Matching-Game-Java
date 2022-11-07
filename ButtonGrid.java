import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ButtonGrid {

    GridPane gPane;
    
    // Creates the grid of buttons with emojis
    public ButtonGrid(){
        gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        int rows = 4;
        int cols = 4;
        Symbols symbols = new Symbols();
        symbols.shuffleSymbols();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                Button btn = new Button(symbols.popString());
                btn.setStyle("-fx-font-size:40");
                gPane.add(btn, i, j, 1, 1);
            }
        }
    }

    // Returns the created gridPane
    public GridPane getGridPane(){
        return this.gPane;
    }
}
