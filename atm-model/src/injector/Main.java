package injector;

import Controller.Controller;
import Model.Model;
import View.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Model model = new Model();
        Controller controller = new Controller();
        View view =new View();
        Scene scene = new Scene(view, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ATM");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
