
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import static javafx.geometry.Pos.CENTER;

/**
 * Created by lytte on 6/27/2016.
 *
 * Purpose, rectangle area
 */
public class Chap1Exercise extends Application {
    public static void main(String [] args) {
    launch(args);
    }
    Scene scene;
    Button button = new Button("rectangle 4.5:7.9");
    Text output = new Text("Output ");
    Label areaofRectangle = new Label("Click button for Rectangle area");
    public void start(Stage primaryStage) throws Exception {
        double width, height;
        width = 4.5;
        height = 7.9;
        button.setOnAction(e -> {
        output.setText("" + area(width, height));
        });
        GridPane gridA = new GridPane();
        gridA.setAlignment(CENTER);
        gridA.setVgap(15.0);
        gridA.setHgap(10.0);
        gridA.add(areaofRectangle, 0, 0);
        gridA.add(button, 1, 0);
        gridA.add(output, 0, 1);
        scene = new Scene(gridA, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        //taking 1.9


        //creates a method for finding the area of a rectangle
        public static double area(double w, double h) {

        double print=w*h;
        return print;
    }

    }

