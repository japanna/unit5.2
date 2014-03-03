// CargoShip.java, unit 5.2.5

/** 
 *  Constructs a "CargoShip"- object.
 *  Pre: a CargoShip cannot have a negative capacity. If it is negative
 *  the capacity will be set to zero.
 *	
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified 3/3, 2014
 */

public class CargoShip extends Ship {

	// data fields
	private double capacity;

	// constructor
	public CargoShip (String name, int year, Engine engine)
	{
		super(name, year, engine);
		this.capacity = 0;
	}

	// accessors
	public double getCapacity()
	{
		return capacity;
	}

	// mutators
	public void setCapacity(double newCapacity)
	{
		// check that capacity is > 0, else set to 0
		if (newCapacity < 0) this.capacity = 0;
		else this.capacity = newCapacity;
	}

	// overrides default toString methods
	public String toString () 
	{
		return "\nName of cargo ship: " + getName() + "\nTonnage capacity: " + capacity; 
	}

	// overrides abstract method set in Ship.java
	public void setNoOfPassengers(int newNo)
	{}
	// overrides abstract method set in Ship.java
	public void setCargo(Cargo ca)
	{}


}
