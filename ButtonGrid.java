import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ButtonGrid {

    GridPane gPane;
    ArrayList<Button> btnList;
    
    // Creates the grid of buttons with emojis
    public ButtonGrid(){
        gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        int rows = 4;
        int cols = 4;
        ArrayList<Button> deadBtnList = new ArrayList<>();
        btnList = new ArrayList<>();
        Symbols symbols = new Symbols();
        symbols.shuffleSymbols();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                Button btn = new Button(symbols.popString());
                btn.setStyle("-fx-font-size:40");
                gPane.add(btn, i, j, 1, 1);
                btnList.add(btn);
                ButtonHandler buttonHandler = new ButtonHandler(btn, deadBtnList);
                btn.setOnAction(buttonHandler);
            }
        }
    }

    public Boolean isFinished(){
        int count = 0;
        for(Button i : btnList){
            if(i.isDisabled() == true){
                count++;
            }
        }
        if (count == 16){
            return true;
        }
        else{
            return false;
        }
    }

    // Returns the created gridPane
    public GridPane getGridPane(){
        return this.gPane;
    }
}
