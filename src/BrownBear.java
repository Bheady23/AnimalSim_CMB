
/**
 * This is the BrownBear class it is a child class to Animal class
 * it also implements the interfaces Walkable and Swimmable. 
 * @author Chris Burkhead
 * Final Programming project
 * @version 1.0
 * CS131ON
 * Summer 2022
 */

public class BrownBear extends Animal implements Walkable, Swimmable{
	
	private String subSpecies;

/**
 * Empty argument constructor calls the instance variables from Animal and sets variable subSpieces
 */
	public BrownBear() {
		super();
		subSpecies="Alaskan";
	}//end empty-argument constructor

/**
 * Preferred constructor sets Super variables SimID, Location, and subSpecies to what is called into the constructor
 * @param simID
 * @param l
 * @param subSpecoes
 */
	
	public BrownBear(int simID, Location l, String subSpecies) {
		super(simID, l);
		this.subSpecies=subSpecies;
	}//end preferred constructor

/**
 * Overrides the swim Method from the swimmable interface. It moves the BrownBear 2 units based on the direction entered in.
 * If a 1 is entered then it moves along the X axis, if a 2 is entered in it moves along the Y axis, 
 */
	
	@Override
	public void swim(int direction) {
		int newX = 0;
		int newY = 0;
		int currentX = this.location.getxCoord();
		int currentY = this.location.getyCoord();
		if (direction==1) {
			newX = currentX+2;
			location.update(newX, currentY);}
		if (direction==2) {
			newY=currentY+2;
			location.update(currentX, newY);}
	}//end swim

/**
 * Overrides the walk Method from the walkable interface. It moves the BrownBear 3 units based on the direction entered in.
 * If a 1 is entered then it moves along the X axis, if a 2 is entered in it moves along the Y axis, 
 */

	@Override
	public void walk(int direction) {
		int newX = 0;
		int newY = 0;
		int currentX = this.location.getxCoord();
		int currentY = this.location.getyCoord();
		if (direction==1) {
			newX = currentX+3;
			location.update(newX, currentY);}
		if (direction==2) {
			newY=currentY+3;
			location.update(currentX, newY);}
	}//end walk

/**
 * Getters and setters for BrownBear class
 * @return
 */

	public String getSubSpecies() {
		return subSpecies;
	}//end getSubSpecies

	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}//end setSubSpecices

/**
 * toString method for BrownBear class
 */
	@Override
	public String toString() {
		return "BrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + location + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString
	
	
}//end class
