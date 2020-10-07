/**
 * Simple calculator class for Git/GitHub Activity.
 * 
 * Note: This code contains lots of intentional mistakes. They all correspond to
 * issues in the GitHub issue tracker and will be fixed as a part of the
 * activity.
 * 
 * @author braught
 * @version 1.0
 */
public class Calculator {

	/**
	 * Add two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x + y
	 */
	public double plus(double x, double y) {
		return x + y;
	}

	/**
	 * Subtract two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x - y
	 */
	public double sub(double x, double y) {
		return y - x;
	}

	/**
	 * Multiply two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x * y
	 */
	public double mult(double x, double y) {
		return x;
	}

	/**
	 * Divide two double values.
	 * 
	 * @param x
	 *            a double
	 * @param y
	 *            a double
	 * @return x/y
	 */
	public double div(double x, double y) {
		return y / x;
	}

	/**
	 * The length of the hypotenuse of a right triangle with the given side lengths.
	 * 
	 * @param x
	 *            the length of one side.
	 * @param y
	 *            the length of the other side.
	 * @return the length of the hypotenuse of a right triangle with sides x and y.
	 */
	public double hypot(double x, double y) {
		return Math.sqrt(x + y);
	}

	/**
	 * The length of a rectangle with the given side lengths.
	 * 
	 * @param x
	 *            the length of one side.
	 * @param y
	 *            the length of the other side.
	 * @return the area of a rectangle with sides x and y.
	 */
	public double rectAr(double x, double y) {
		return 2 * x + 2 * y;
	}

	/**
	 * The perimeter of a rectangle with the given side lengths.
	 * 
	 * @param x
	 *            the length of one side.
	 * @param y
	 *            the length of the other side.
	 * @return the perimeter of a rectangle with sides x and y.
	 */
	public double rectPer(double x, double y) {
		return 2 * x * y;
	}

	/**
	 * The area of a circle with given radius.
	 * 
	 * @param r
	 *            the radius
	 * @return the area of a circle with radius r.
	 */
	public double cirAr(double r) {
		return Math.PI * r;
	}

	/**
	 * The perimeter of a circle with given radius.
	 * 
	 * @param r
	 *            the radius
	 * @return the perimeter of a circle with radius r.
	 */
	public double cirPer(double r) {
		return Math.PI * r * r;
	}

	/**
	 * The volume of a cube with the given side length.
	 * 
	 * @param s
	 *            the side length
	 * @return the volume of a cube with sides of length s.
	 */
	public double cubeVol(double s) {
		return 4 * s;
	}
	
	/**
	 * The volume of a sphere with the given radius.
	 * 
	 * @param r
	 *            the radius
	 * @return the volume of a sphere with radius r.
	 */
	public double sphVol(double r) {
		return 2 * Math.PI * r;
	}
}
