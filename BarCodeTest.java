// BarCodeTest.java

public class BarCodeTest 
{
	public static void main (String [] args) 
	{
		// test 1: make a bar code out of a zip code
		BarCode bc1 = new BarCode ("02138");
		// test for legal input
		if (bc1.getBarCode() == null) zipError();
		// print result
		else System.out.println ("\nThe bar code for zip 02138 is " + bc1.getBarCode() + "\n");

		// test 2: make a zip code out of a bar code
		BarCode zc1 = new BarCode ("||:|:::|:|:||::::::||:|::|:::|||");
		// test for legal input
		if (zc1.getZipCode()== null) barError();
		// print result
		else System.out.println ("The zip code for bar code ||:|:::|:|:||::::::||:|::|:::||| is " + zc1.getZipCode() + "\n");

		// test 3: make a bar code out of zip code
		BarCode bc2 = new BarCode ("63124");
		// test for legal input
		if (bc2.getBarCode() == null) zipError();
		// print result
		else System.out.println ("The bar code for zip 63124 is " + bc2.getBarCode() + "\n");

		// test4: to make a zip code out of a bar code
		BarCode zc2 = new BarCode (bc2.getBarCode());
		// test for legal input
		if (zc2.getZipCode()== null) barError();
		// print result
		else System.out.println ("The zip code for bar code " + zc2.getBarCode() + " is " + zc2.getZipCode() + "\n");

		// test5: make a zip code out of a bar code
		BarCode zc3 = new BarCode ("||:::||::|:::|:|:|::|||:::||:::|");
		// test for legal input
		if (zc3.getZipCode()== null) barError();
		// print result
		else System.out.println ("The zip code for bar code ||:::||::|:::|:|:|::|||:::||:::| is " + zc3.getZipCode() + "\n");

		// test6: make a zip code out of a bar code
		BarCode zc4 = new BarCode ("||:|:::|:|:||::::::||:|::|:::||");
		// test for legal input
		if (zc4.getZipCode()== null) barError();
		// print result
		else System.out.println ("The zip code for bar code ||:|:::|:|:||::::::||:|::|:::|| is " + zc4.getZipCode() + "\n");
		
		// test7: make a zip code out of a bar code
		BarCode zc5 = new BarCode ("||:|:::|:|:||::::::||:|::|:::||:");
		// test for legal input
		if (zc5.getZipCode()== null) barError();
		// print result
		else System.out.println ("The zip code for bar code ||:|:::|:|:||::::::||:|::|:::||: is " + zc5.getZipCode() + "\n");
	}

	// helper functions for error messages
	private static void zipError()
	{
		System.out.println("\nSorry. This is not a valid zip code. Try again.\n");
	}

	private static void barError()
	{
		System.out.println("\nSorry. This is not a valid bar code. Try again.\n");
	}
}