// BulkVessel.java, unit 5.2.5

/** 
 *  Constructs a "BulkVessel"- object.
 *
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified ________, 2014
 */


public class BulkVessel extends CargoShip {

	// data fields
	private Cargo cargo;

	// constructor
	public BulkVessel (String name, int year, Engine engine)
	{
		super(name, year, engine);
	}

	// accessors
	public Cargo getCargo()
	{
		return cargo;
	}

	// mutators
	public void setCargo(Cargo newCargo)
	{
		this.cargo = newCargo;
	}

	// overrides default toString methods
	public String toString () 
	{
		return "\nName of bulk vessel: " + getName() + "\nCargo: " + getCargo(); 
	}
}