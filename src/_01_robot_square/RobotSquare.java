package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot metalica = new Robot();
        // 3. Put the robot's pen down
metalica.penDown();

        // 6. Make the robot move as fast as possible
metalica.setSpeed(30);

        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels

metalica.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)

metalica.penDown();
metalica.turn(90);
metalica.move(200);
metalica.turn(90);  
metalica.move(200);
metalica.turn(90);
metalica.move(200);
metalica.move(200);
metalica.turn(90);    
metalica.move(200);
metalica.turn(90);
metalica.move(200);
metalica.turn(45);
metalica.move(282);
metalica.penUp();
metalica.turn(225);
metalica.move(199);
metalica.penDown();
metalica.turn(225);
metalica.move(280);
metalica.turn(450);
metalica.move(280);
metalica.turn(496);
metalica.penUp();
metalica.move(190);
metalica.penDown();
metalica.turn(479);
metalica.move(289);





    }
}
