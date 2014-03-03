// Cruiseship.java, unit 5.2.5

/** 
 *  Constructs a "Cruiseship"- object.
 *	There are currently no getter or setter methods for the field "noroVirus",
 *  since there are currently no clients accessing or setting that information.
 *  Pre: a cruiseship cannot have a negative passenger capacity. If it is negative
 *  the capacity will be set to zero.
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified 3/3, 2014
 */

public class Cruiseship extends Ship {

	// data fields
	private int noOfPassengers;
	private boolean noroVirus;

	// constructor
	public Cruiseship (String name, int year, Engine engine)
	{
		super(name, year, engine);
		this.noOfPassengers = 0;
		this.noroVirus = false; // assuming that the default state of cruise ship is no norovirus?
	}

	// accessors
	public int getNoOfPassengers ()
	{
		return noOfPassengers;
	}

	// mutators
	public void setNoOfPassengers (int newNoOfPassengers)
	{
		// check that passenger capacity is > 0, else set to 0
		if (newNoOfPassengers < 0) this.noOfPassengers = 0;
		else this.noOfPassengers = newNoOfPassengers;
	}

	// overrides default toString methods
	public String toString () 
	{
		return "\nName of cruise ship: " + getName() + "\nPassenger capacity: " + noOfPassengers; 
	}

	// overrides abstract method set in Ship.java
	public void setCapacity(double d)
	{}
	// overrides abstract method set in Ship.java
	public void setCargo(Cargo ca)
	{}
}