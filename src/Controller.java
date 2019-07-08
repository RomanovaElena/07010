import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Controller {
    @FXML
    Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    public void onExit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void initialize(){
        btn1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent) {
                try{
                    Stage stage = new Stage ();
                    Parent root = FXMLLoader.load(getClass().getResource("1.fxml"));
                    stage.setTitle ("ОКНО 1. ОПИСАНИЕ ЗАДАЧИ");
                    stage.setMinHeight (330);
                    stage.setMinWidth (600);
                    stage.setResizable (true);
                    stage.setScene (new Scene(root));
                    stage.initModality (Modality.NONE);
                    stage.show ();
                }catch (Exception ex){
                    ex.printStackTrace ();
                }
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent actionEvent) {
                try{
                    Stage stage = new Stage ();
                    Parent root = FXMLLoader.load(getClass().getResource("2.fxml"));
                    stage.setTitle ("ОКНО 2. РЕШИТЬ ЗАДАЧУ");
                    stage.setMinHeight (330);
                    stage.setMinWidth (600);
                    stage.setResizable (true);
                    stage.setScene (new Scene(root));
                    stage.initModality (Modality.NONE);
                    stage.show ();
                }catch (Exception ex){
                    ex.printStackTrace ();
                }
            }
        });
    }
}
