package demos;

/**
 * Memory models and variable scope (Week 2 Concept Challenge)
 * @author chooyl
 *
 */

public class ArrayLocation {
	private double coords[];	// declare member variable of type array of doubles
	
	public ArrayLocation(double[] coords) {
		this.coords = coords;
	}
	
	public static void main(String[] args) {
		double[] c = {5.0, 0.0};	// initialize array with specified values
		ArrayLocation accra = new ArrayLocation(c);
		c[0] = 32.9;
		c[1] = -117.2;
		System.out.println(accra.coords[0]);
	}
	
}
	
	