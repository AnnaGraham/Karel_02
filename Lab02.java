/**
*
* An athlete navigates a maze while leaving a trail of beepers
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Lab02{

     public static void main(String[] args) {
          // TODO Your code goes here
    	 Display.openWorld("maps/maze.map");
    	 Display.setSize(8, 8);
    	 
    	 Athlete escape = new Athlete();
    	 escape.putBeeper();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnRight();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnLeft();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnLeft();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnRight();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnRight();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnRight();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnLeft();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnRight();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnLeft();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnLeft();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.turnRight();
    	 escape.move();
    	 escape.putBeeper();
    	 escape.move();
    	 escape.putBeeper();
    	 
    	 
     }
}
