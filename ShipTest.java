import java.util.*;



public class ShipTest
{ 
	public static void main (String [] args) 
 	{ 
		Ship [] myShips = new Ship [1]; 
 
 		myShips [0] = new Cruiseship ("Carnival", 1998, Engine.WIND); 
 		myShips[0].setNoOfPassengers(6);
 		
 
 		//myPets [1] = new Cat ("Tigi", 1999); 
 		//myPets [2] = new Cat ("Sheldon", 2001); 
 
 		for (Ship p : myShips) 
 		{ 
 			System.out.println (p); 
 		} 
 	} 
} 
 
 