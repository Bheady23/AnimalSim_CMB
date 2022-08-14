
/**
 * This is the Goldfinch class it is a child class to Animal class
 * it also implements the interfaces Walkable and Flyable. 
 * @author Chris Burkhead
 * Final Programming project
 * @version 1.0
 * CS131ON
 * Summer 2022
 */
public class Goldfinch extends Animal implements Flyable, Walkable{

	private double wingSpan;
	
/**
 * Empty argument constructor calls the instance variables from Animal and sets variable wingSpan
 */
	
	public Goldfinch(){
		super();
		wingSpan=9.0;
	}//end empty-argument constructor

/**
 * Preferred constructor sets Super variables SimID, Location, and wingSpan to what is called into the constructor
 * @param simID
 * @param l
 * @param wingSpan
 */
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		super(simID, l);
		this.wingSpan=wingSpan;
	}//end preferred constructor
	
/**
 * Overrides the walk Method from the walkable interface. It moves the Goldfinch 1 unit based on the direction entered in.
 * If a 1 is entered then it moves along the X axis, if a 2 is entered in it moves along the Y axis, 
 */
	
	@Override
	public void walk(int direction) {
		int newX = 0;
		int newY = 0;
		int currentX = this.location.getxCoord();
		int currentY = this.location.getyCoord();
		if (direction==1) {
			newX = currentX+1;
			location.update(newX, currentY);}
		if (direction==2) {
			newY=currentY+1;
			location.update(currentX, newY);}
		}//end walk

/**
 * Overrides the Fly method from the Flyable interface. It moves the Goldfinch to a new location based on the new xCoord
 * and yCoord entered in.  
 */
	
	@Override
	public void fly(Location l) {
	
		//capture new location
		int newX = l.getxCoord();
		int newY = l.getyCoord();
		
		location.update(newX, newY);
	}//end fly

/**
 * Getters and setters for Goldfinch class
 * @return
 */
	
	public double getWingSpan() {
		return wingSpan;
	}//end getWingSpan

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}//end setWingSpan

/** 
 * toString method for GoldFinch class
 */

	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested+"]";
	}//end toString

	
	
	
}//end class
