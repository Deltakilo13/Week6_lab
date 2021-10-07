package com.mycompany.mavenproject3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
Label label;
TextField tf,tf1, tf2;
    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        Label label = new Label("Click the Button " );
       
        Button btn1= new Button("Click the Button");
        btn1.setLayoutX(50);btn1.setLayoutY(50);
        btn1.setOnAction( v->{
            label.setText("I clicked the btn - "  );
        });
        
       
        TextField tf1 = new TextField(" ");
        tf.setLayoutX(150); tf.setLayoutY(150);
        
        TextField tf2 = new TextField("");
        tf.setLayoutX(100); tf.setLayoutY(100);
        
        Group gp = new Group (label, btn1, tf1, tf2);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI Demo 2");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
       
    }
    private void processBttn2 (ActionEvent arg0) {
        String cntnt1= tf1.getText().trim();
        String cntnt2= tf2.getText().trim();
        int nm = Integer.parseInt(tf1.getText());
        int nm2 = Integer.parseInt(tf2.getText());
        
        tf.setText( "" + (nm *1000) );
        label.setTextFill(Color.RED);
    }
}