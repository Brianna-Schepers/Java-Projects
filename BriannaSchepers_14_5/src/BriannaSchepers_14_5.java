//Brianna Schepers
//Chapter 14 Assignment 5
//This program uses Javafx to display the words 'Welcome to Java' in a circle.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class BriannaSchepers_14_5 extends Application{
	@Override 
	public void start(Stage primaryStage) {
		
	    Pane pane = new Pane();
	    
	    String[] welcome = "Welcome to Java".split("");
	    
	    //Establishes the characteristics of the rotation, angle, and radius.
	    double radius = 75;
	    double angle = 0;
	    double rotate = 90;
	    
	    Font font = Font.font("Times New Roman", FontWeight.BOLD,30);
	    
	    //A for loop to rotate the characters of the Welcome array.
	    for (int i = 0; i < welcome.length; i++, angle += 23, rotate += 23 ) {
	    	double x = 90 + radius * Math.cos(Math.toRadians(angle));
            double y = 100 + radius * Math.sin(Math.toRadians(angle));
            Text text = new Text(x, y,welcome[i]);
            text.setRotate(rotate);
            text.setFont(font);
            pane.getChildren().add(text);

	    }
	    
	    //Creates the scene for the text to display on. 
	    Scene scene = new Scene(pane,200,200);
	    primaryStage.setTitle("Welcome to Java");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    
	  }
	}
