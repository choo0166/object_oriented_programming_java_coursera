package demos;

import processing.core.PApplet;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyDisplay extends PApplet {

	public void setup()
	{
		size(400, 400);
		background(200, 200, 200);
		
	}
	
	public void draw()
	{
		// Draw yellow ellipse centered on canvas
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		// Draw black ellipses as eyes
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70); // Left eye
		ellipse(280, 130, 50, 70); // Right eye is 120px from right of canvas
		// Draw smile
		noFill();
		arc(200, 260, 100, 60, 0, PI);
	}
	
}
