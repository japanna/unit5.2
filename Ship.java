// Ship.java, unit 5.2.5

/** 
 *  The abstract class "Ship" enables the construction of various "Ship"-objects
 *  such as "Cruiseship", "CargoShip" and "BulkVessel".
 *  The class supports a minimum of "getter"- and "setter" methods
 *  on purpose, since currently there are no client methods that need acces to
 *  the "engine" field. 
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified 3/3, 2014
 */

enum Engine {
		STEAM_ENGINE, STEAM_TURBINE, GAS_TURBINE, DIESEL, 
		ELECTRIC, WIND, HUMAN_FORCE
	};

enum Cargo {
		GRAINS, COAL, ORE, CEMENT, PUPPETS
	};


public abstract class Ship {

	// data fields
	private String name; // ship's name
	private int year; // year ship was built
	private Engine engine;
	

	// constructor
	public Ship (String name, int year, Engine engine) 
	{
		this.name = name;
		// check that year is a four-digit number
		int length = String.valueOf(year).length();
		if (length != 4) this.year = 0;
		else this.year = year;
		this.engine = engine;
	}

	// accessor ("getter") methods
	// currently no other getter or setter methods are available
	public String getName() 
	{
		return name;
	}

	public int getYear() 
	{
		return year;
	}

	// toString method that displays the ship’s name, the engine type, 
	// and year it was built

	public String toString () 
	{
		return name + ", " + engine + ", " + year; 
	}

	public abstract void setNoOfPassengers(int newNo);

	public abstract void setCapacity(double newCap);

	public abstract void setCargo(Cargo newCargo);
}