import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.awt.*;

public class Controller2 {

    @FXML
    TextField aX;

    @FXML
    TextField aY;

    @FXML
    TextField bX;

    @FXML
    TextField bY;

    @FXML
    TextField cX;

    @FXML
    TextField cY;

    @FXML
    TextField r;

    @FXML
    TextArea textResult;

    @FXML
    Button btn;

    int rad;
    int xa;
    int ya;
    int xb;
    int yb;
    int xc;
    int yc;
    String result;
    
    public void init(){
        rad = Integer.parseInt(r.getText());
        xa =  Integer.parseInt(aX.getText());
        ya =  Integer.parseInt(aY.getText());
        xb =  Integer.parseInt(bX.getText());
        yb =  Integer.parseInt(bY.getText());
        xc =  Integer.parseInt(cX.getText());
        yc =  Integer.parseInt(cY.getText());
        Calc c = new Calc();
        result = c.calc(rad, xa, ya, xb, yb, xc, yc);
        textResult.setText(result);
    }
    public void onCalc(ActionEvent actionEvent){
        init();
    }

}
