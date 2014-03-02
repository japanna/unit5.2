// Ship.java, unit 5.2.5

/** 
 *  
 *
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified ________, 2014
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
		this.year = year;
		this.engine = engine;
	}

	// accessor ("getter") methods
	public String getName() 
	{
		return name;
	}

	public int getYear() 
	{
		return year;
	}

	public Engine getEngine() 
	{
		return engine;
	}

	// mutator ("setter") methods
	public void setName (String newName)
	{
		this.name = newName;
	}

	public void setYear (int newYear)
	{
		this.year = newYear;
	}

	public void setEngine (Engine newEngine)
	{
		this.engine = newEngine;
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