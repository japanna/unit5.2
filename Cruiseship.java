// Cruiseship.java, unit 5.2.5

/** 
 *  
 *
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified ________, 2014
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

	public boolean getNoroVirus ()
	{
		return noroVirus;
	}

	// mutators
	public void setNoOfPassengers (int newNoOfPassengers)
	{
		this.noOfPassengers = newNoOfPassengers;
	}

	public void setNoroVirus (boolean isNoroVirus)
	{
		this.noroVirus = isNoroVirus;
	}

	public String toString () 
	{
		return getName() + ", " + getNoOfPassengers(); 
	}
}