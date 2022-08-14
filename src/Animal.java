import java.util.*;

/**
 * This is the Animal class it is abstract, it is the parent class to the Goldfinch and BrownBear classes.
 * It sets several instance variables and methods to be shared by the classes that extend it. 
 * @author Chris Burkhead
 * Final Programming project
 * @version 1.0
 * CS131ON
 * Summer 2022
 */

public abstract class Animal {
	
	protected int simID;
	protected Location location;
	protected boolean full;
	protected boolean rested;

/**
 *Empty-argument constructor, sets all instance variables. 
 */
	
	public Animal(){
		simID=0;
		this.location = new Location(0,0);
		full=false;
		rested=true;
	}//end empty-argument constructor
	
/**
 * Preferred constructor sets the instance variables to the data that is passed into the constructor
 * @param simID
 * @param l
 */
	
	public Animal (int simID, Location l) {
		this.simID=simID;
		this.location=l;
		this.full=false;
		this.rested=true;
	}//end preferred constructor
	
/**
 * boolean eat determines if an animal has eaten enough or not by generating a random float between 0 and 1
 * .5 or below means the animal is not full, above .5 means the animal is full 
 * @return
 */
	
	public boolean eat() {
		Random generator= new Random();
		float numFull=generator.nextFloat();
		System.out.println(numFull);
		if (numFull<=.5)
			full=false;
		else if (numFull>.5)
			full=true;
		return full;
	}//end eat
	
/**
 * boolean sleep determines if an animal has slept enough or not by generating a random float between 0 and 1
 * .5 or below means the animal is not rested, above .5 means the animal is rested
 * @return
 */
	
	public boolean sleep() {
		Random generator= new Random();
		float numSleep=generator.nextFloat();
		System.out.println(numSleep);
		if (numSleep<=.5)
			rested=false;
		else if (numSleep>.5)
			rested=true;
		return rested;
	}//end sleep
	
/**
 * Getters and setters for class Animal
 * @return
 */

	public int getSimID() {
		return simID;
	}//end getSimID

	public void setSimID(int simID) {
		this.simID = simID;
	}//end setSimID

	public Location getLocation() {
		return location;
	}//end getLocation

	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation

	public boolean isFull() {
		return full;
	}//end isFull

	public void setFull(boolean full) {
		this.full = full;
	}//end setFull

	public boolean isRested() {
		return rested;
	}//end isRested

	public void setRested(boolean rested) {
		this.rested = rested;
	}//end setRested

	
}//end class
