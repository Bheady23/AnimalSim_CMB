
/**
 * This is the Location class, it allows the location of an Animal object to be set, stored and updated.
 * @author Chris Burkhead
 * Final Programming project
 * @version 1.0
 * CS131ON
 * Summer 2022
 */

public class Location {
	
	private int xCoord, yCoord;
	
/**
 * Empty argument constructor
 */
	
	public Location() {
		xCoord=0;
		yCoord=0;
	}//end empty-argument constructor
	
/**
 * Preferred constructor sets coordinates X and Y	
 * @param x
 * @param y
 */
	
	public Location(int x, int y) {
		super();
		this.setxCoord(x);
		this.setyCoord(y);
	}//end preferred constructor
	
/**
 * Method Update updates the xCoord and yCoord variables to what it passed into them using x and y
 * @param x
 * @param y
 */
	
	public void update(int x, int y) {
		xCoord=x;
		yCoord=y;
	}//end update method
	
/**
 * getCoordinates method creates an array of xCoord and yCoord variables. 	
 * @return
 */
	
	public int [] getCoordinates() {
		int[] coordinates= {xCoord, yCoord};
		return coordinates;
	}//end getCoordinates
	
/**
 * Getters and setters for the class
 * @return
 */
	public int getxCoord() {
		return xCoord;
	}//end getxCoord

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}//end setxCoord

	public int getyCoord() {
		return yCoord;
	}//end getyCoord

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}//end setyCoord
	
/**
 * toString for the Location class
 */
	@Override
	public String toString() {
		return "[xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}//end toString

	
}//end class
