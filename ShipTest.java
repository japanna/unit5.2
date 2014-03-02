import java.util.*;



public class ShipTest
{ 
	public static void main (String [] args) 
 	{ 
		Ship [] myShips = new Ship [6]; 
 
 		myShips [0] = new Cruiseship ("Carnival", 1998, Engine.WIND); 
 		myShips[0].setNoOfPassengers(6000);
 		myShips [1] = new CargoShip ("Viking", 2000, Engine.DIESEL); 
 		myShips[1].setCapacity(1000.0);
 		myShips [2] = new BulkVessel ("Poseidon", 1978, Engine.ELECTRIC); 
 		myShips[2].setCargo(Cargo.ORE);
 		myShips [3] = new Cruiseship ("Love Boat", 1983, Engine.STEAM_TURBINE); 
 		myShips[3].setNoOfPassengers(900);
 		myShips [4] = new CargoShip ("Boss", 2014, Engine.HUMAN_FORCE); 
 		myShips[4].setCapacity(3000.0);
 		myShips [5] = new BulkVessel ("Ariadne", 1999, Engine.GAS_TURBINE); 
 		myShips[5].setCargo(Cargo.PUPPETS);

 		for (Ship p : myShips) 
 		{ 
 			System.out.println (p); 
 		} 
 	} 
} 
 
 