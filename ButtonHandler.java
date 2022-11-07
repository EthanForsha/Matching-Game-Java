import java.util.ArrayList;
import javafx.event.*;
import javafx.scene.control.Button;

public class ButtonHandler implements EventHandler<ActionEvent>{

    Button btn;
    ArrayList<Button> list;

    public ButtonHandler(Button btn, ArrayList<Button> list) {
        this.btn = btn;
        this.list = list;
    }

    @Override
    public void handle(ActionEvent e){
        int scenario = 0;
        for(int i = 0; i < list.size();){
            if (list.get(i).getText().equals(this.btn.getText())){
                list.get(i).setDisable(true);
                btn.setDisable(true);
                list.removeAll(list);
                scenario = 1;
                break;
            }
            else{
                btn.setDisable(false);
                list.get(i).setDisable(false);
                this.list.removeAll(list);
                scenario = 2;
                break;
            }
        }
        if (this.list.size() == 0 && scenario == 0){
            this.list.add(this.btn);
            this.btn.setDisable(true);
        }
    }
}