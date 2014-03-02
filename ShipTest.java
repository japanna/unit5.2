import java.util.*;



public class ShipTest
{ 
	public static void main (String [] args) 
 	{ 
		Ship [] myShips = new Ship [3]; 
 
 		myShips [0] = new Cruiseship ("Carnival", 1998, Engine.WIND); 
 		myShips[0].setNoOfPassengers(6);
 		myShips [1] = new CargoShip ("Viking", 2000, Engine.DIESEL); 
 		myShips[1].setCapacity(1000.0);
 		myShips [2] = new BulkVessel ("Poseidon", 1978, Engine.ELECTRIC); 
 		myShips[2].setCargo(Cargo.ORE);
 		
 
 		//myPets [1] = new Cat ("Tigi", 1999); 
 		//myPets [2] = new Cat ("Sheldon", 2001); 
 
 		for (Ship p : myShips) 
 		{ 
 			System.out.println (p); 
 		} 
 	} 
} 
 
 