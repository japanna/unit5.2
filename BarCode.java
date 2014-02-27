// BarCode.java, unit 5.2.4

/** 
 *  Takes a 5-digit zip code as input, and prints the bar code 
 *	using the symbol | for a full bar and : for a half bar.  
 *	It also takes a bar code as input and prints the corresponding 
 *	5-digit zip code.
 *
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified ________, 2014
 */

public class BarCode {

	// data fields
	private String myZipCode; // five-digit zip code
	private String myBarCode; // represents 32-character bar code

	// constructor zip

	public BarCode (String barOrZip) {

		// check if zip code
		if (barOrZip.length() == 5) {
			myZipCode = barOrZip;
			// initialize myBarCode
			myBarCode = encode(myZipCode); 
		}
		// check if bar code
		else if (barOrZip.length() == 32) {
			myBarCode = barOrZip;
			// initialize myZipCode
			myZipCode = decode(myBarCode); 
		}
			else throw new IllegalArgumentException();	
	}

}