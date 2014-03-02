// CargoShip.java, unit 5.2.5

/** 
 *  
 *
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified ________, 2014
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
		this.capacity = newCapacity;
	}

	public String toString () 
	{
		return "\nName of ship: " + getName() + "\nTonnage capacity: " + getCapacity(); 
	}

	public void setNoOfPassengers(int newNo)
	{}

	public void setCargo(Cargo ca)
	{}


}
