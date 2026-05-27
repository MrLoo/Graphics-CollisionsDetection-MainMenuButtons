package displayobjattributes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 090464
 */
import processing.core.PApplet;

public class MySketch extends PApplet {
  private Person person; // declare a person object
  private Button startButton, helpButton;
  private int stage = 0;
  
  private boolean showInfo = false; // whether or not to display the person's info

  
  public void settings() {
    size(400, 400);
  }
  public void setup() {
    background(255); 
    person = new Person(this, 100, 100, "Mr. Lu", 99, "images/person.png"); 
    startButton = new Button(this, 50, 50, "images/start-button.png");
    helpButton = new Button(this, 50, 150, "images/help-button.png");
  }
  
  public void draw() {
    if (stage == 0 ) {
      startButton.draw();
      helpButton.draw();
    } else if (stage == 1) {
        background(255); // clear the screen
        person.draw(); // draw the person on the screen    
    } else if (stage == 2) {
        background(255); // clear the screen
        textSize(20);
        fill(0);
        text("help screen",100, 100);
    }
  }
  public void mousePressed(){
    if (stage == 0 ) {
      // Check if the start button was clicked using rectangular collision
      if (startButton.isClicked(mouseX, mouseY)) {
        stage = 1; // Switch state to game
      } else if (helpButton.isClicked(mouseX, mouseY)) {
        stage = 2; // Switch state to help screen
      }
    }
  }

}



