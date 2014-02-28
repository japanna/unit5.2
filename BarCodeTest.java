// BarCodeTest.java

public class BarCodeTest 
{
	public static void main (String [] args) 
	{
	/*	// test 1 to make a bar code out of zip code
		BarCode bc1 = new BarCode ("02138");
		if (bc1.getBarCode() == null) 
		{
			System.out.println("Error");
		}
		else 
		{
			System.out.println ("\nConverting zip code 02138 into bar code... ");
			System.out.println ("The bar code for zip 02138 is " + bc1.getBarCode() + "\n");
		}
	// test 1 to make a zip code out of a bar code
		BarCode zc1 = new BarCode ("||:|:::|:|:||::::::||:|::|:::|||");
		// //remember to check that zip is valid in the constructor
		System.out.println ("Converting bar code into zip code...");
		System.out.println ("The zip code for bar code ||:|:::|:|:||::::::||:|::|:::||| is " + zc1.getZipCode() + "\n");
	*/
		// test 2 to make a bar code out of zip code
		BarCode bc2 = new BarCode ("63124");
		// //remember to check that zip is valid in the constructor
		System.out.println ("The bar code for zip 63124 is " + bc2.getBarCode() + "\n");

		// test 2 to make a zip code out of a bar code
		BarCode zc2 = new BarCode (bc2.getBarCode());
		// //remember to check that zip is valid in the constructor
		System.out.println ("Converting bar code into zip code...");
		System.out.println ("The zip code for bar code " + zc2.getBarCode() + "is " + zc2.getZipCode() + "\n");
/*
		// test 3 to make a zip code out of a bar code
		BarCode zc3 = new BarCode ("||:::||::|:::|:|:|::|||:::||:::|");
		// // remember to check that zip is valid in the constructor
		System.out.println ("Converting bar code into zip code...");
		System.out.println ("The zip code for bar code ||:::||::|:::|:|:|::|||:::||:::| is " + zc3.getZipCode() + "\n");

		// test 4 to make a zip code out of a bar code
		BarCode zc4 = new BarCode ("||:|:::|:|:||::::::||:|::|:::||");
		// // remember to check that zip is valid in the constructor
		System.out.println ("Converting bar code into zip code...");
		System.out.println ("The zip code for bar code ||:|:::|:|:||::::::||:|::|:::|| is " + zc4.getZipCode() + "\n");

		// test 5 to make a zip code out of a bar code
		BarCode zc4 = new BarCode ("||:|:::|:|:||::::::||:|::|:::||:");
		// // remember to check that zip is valid in the constructor
		System.out.println ("Converting bar code into zip code...");
		System.out.println ("The zip code for bar code ||:|:::|:|:||::::::||:|::|:::||: is " + zc5.getZipCode() + "\n");



*/
	}
}