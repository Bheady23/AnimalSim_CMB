import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is the application class that tests all the classes in the package. The package represents an animal simulation 
 * and demonstrates Generics by building an array of animal Objects
 * @author Chris Burkhead
 * Final Programming project
 * @version 1.0
 * CS131ON
 * Summer 2022
 
 */

public class Application {

	public static void main(String[] args) {
		
		
		//Using StringBuilder to set Header
		StringBuilder lt = new StringBuilder("************************************************\n");
		lt.append("\n");
		lt.append("\n");
		lt.append("                Location Tests\n");
		lt.append("\n");
		lt.append("\n");
		lt.append("************************************************\n");
		System.out.print(lt.toString());
		
		System.out.println();
		
		//instantiating a Location, printing it using toString
		Location one=new Location(4, 5);
		System.out.println(one.toString());
		//Using update method to move location
		one.update(15, 25);
		System.out.println(one.toString());
		//printing array of coordinates
		System.out.println(Arrays.toString(one.getCoordinates()));
		
		System.out.println();
		
		//Using StringBuilder to set Header
		StringBuilder at = new StringBuilder("************************************************\n");
		at.append("\n");
		at.append("\n");
		at.append("                Animal Tests\n");
		at.append("\n");
		at.append("\n");
		at.append("************************************************\n");
		System.out.print(at.toString());
		
		System.out.println();
		
		//Testing that Animal is abstract and can't be instantiated
		//If you uncomment the following line it will give you an error 
		//that the Animal class can't be instantiated
		//Animal Animal = new Animal (025, new Location(1,2));
		
		//Using StringBuilder to set Header
		StringBuilder gt = new StringBuilder("************************************************\n");
		gt.append("\n");
		gt.append("\n");
		gt.append("                Goldfinch Tests\n");
		gt.append("\n");
		gt.append("\n");
		gt.append("************************************************\n");
		System.out.print(gt.toString());
				
		System.out.println();
		
		//instantiating a Goldfinch and testing all getters setters and methods
		Goldfinch pete=new Goldfinch(49, new Location(23,45), 12.5);
		System.out.println(pete.toString());
		pete.eat();
		System.out.println(pete.full);
		pete.sleep();
		System.out.println(pete.rested);
		pete.walk(1);
		System.out.println(pete.location);
		pete.walk(2);
		System.out.println(pete.location);
		pete.fly(new Location(56, 67));
		System.out.println(pete.location);
		
		System.out.println();
		
		//Using StringBuilder to set Header
		StringBuilder bt = new StringBuilder("************************************************\n");
		bt.append("\n");
		bt.append("\n");
		bt.append("                BrownBear Tests\n");
		bt.append("\n");
		bt.append("\n");
		bt.append("************************************************\n");
		System.out.print(bt.toString());
		System.out.println();
		
		//instantiating a BrownBear and testing all getters setters and methods
		BrownBear machoMan = new BrownBear(25, new Location(157, 235), "Kodiak");
		System.out.println(machoMan.toString());
		machoMan.eat();
		System.out.println(machoMan.full);
		machoMan.sleep();
		System.out.println(machoMan.rested);
		machoMan.walk(1);
		System.out.println(machoMan.location);
		machoMan.walk(2);
		System.out.println(machoMan.location);
		machoMan.swim(1);
		System.out.println(machoMan.location);
		machoMan.swim(2);
		System.out.println(machoMan.location);
		System.out.println();
		
		//Using StringBuilder to set Header
		StringBuilder genT = new StringBuilder("************************************************\n");
		genT.append("\n");
		genT.append("\n");
		genT.append("                Generics Tests\n");
		genT.append("\n");
		genT.append("\n");
		genT.append("************************************************\n");
		System.out.print(genT.toString());
		System.out.println();
		
		//creating an ArrayList of animal objects
		ArrayList<Animal> animals=new ArrayList<Animal>();
		
		//adding objects to the animals ArrayList
		animals.add(new BrownBear(3, new Location(35, 45), "Alaskan"));
		animals.add(new BrownBear(4, new Location(135, 145), "Asiatic"));
		animals.add(new BrownBear(5, new Location(235, 245), "European"));
		animals.add(new BrownBear(6, new Location(335, 345), "Grizzly"));
		animals.add(new BrownBear(7, new Location(435, 445), "Siberian"));
		animals.add(new BrownBear(8, new Location(535, 545), "Alaskan"));
		animals.add(new BrownBear(9, new Location(635, 645), "Siberian"));
		animals.add(new BrownBear(10, new Location(735, 745), "Kodiak"));
		animals.add(new BrownBear(11, new Location(835, 845), "Asiatic"));
		animals.add(new BrownBear(12, new Location(935, 945), "Grizzly"));
		animals.add(new Goldfinch(13, new Location(22,67), 3.35));
		animals.add(new Goldfinch(14, new Location(122,967), 4.5));
		animals.add(new Goldfinch(15, new Location(222,867), 5.55));
		animals.add(new Goldfinch(16, new Location(322,767), 6.67));
		animals.add(new Goldfinch(17, new Location(422,667), 7.47));
		animals.add(new Goldfinch(18, new Location(522,567), 8.88));
		animals.add(new Goldfinch(19, new Location(622,467), 9.6));
		animals.add(new Goldfinch(20, new Location(722,637), 10.15));
		animals.add(new Goldfinch(21, new Location(822,267), 11.35));
		animals.add(new Goldfinch(22, new Location(922,167), 12.2));
		
		//Iterating through the array and printing all items using toString
		for(Animal m : animals) {
			String brownFinch = m.toString();
			System.out.println(brownFinch);}
	}//end for loop
	
	
}//end class

