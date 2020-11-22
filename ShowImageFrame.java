import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileInputStream;


public class ShowImageFrame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My Frame");
        GridPane gridPane=new GridPane();
        Button btn1=new Button("ONE");
        Button btn2=new Button("TWO");

        FileInputStream inputImg1=new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\week8tute\\zero.png");
        FileInputStream inputImg2=new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\week8tute\\one.png");
        FileInputStream inputImg3=new FileInputStream("C:\\Users\\ASUS\\IdeaProjects\\week8tute\\two.png");
        Image imgZero=new Image(inputImg1);
        Image imgOne=new Image(inputImg2);
        Image imgTwo=new Image(inputImg3);

        ImageView imageView=new ImageView(imgZero);
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ImageView imageView =new ImageView(imgOne);
                HBox hBox1=new HBox(imageView);
            }
        });


        HBox hBox1=new HBox(imageView);
        HBox hBox2=new HBox(15,btn1,btn2);

        gridPane.add(hBox1,1,1,1,1);
        gridPane.add(hBox2,1,2,1,1);
        Scene scene =new Scene(gridPane,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
