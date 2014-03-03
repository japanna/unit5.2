// BarCode.java, unit 5.2.4

/** 
 *  Takes a 5-digit zip code as input, and prints the bar code 
 *	using the symbol | for a full bar and : for a half bar.  
 *	It also takes a bar code as input and prints the corresponding 
 *	5-digit zip code.
 *
 *
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified 3/3, 2014
 */

import java.util.*;

public class BarCode {

	// data fields
	private String myZipCode; // five-digit zip code
	private String myBarCode; // represents 32-character bar code

	// constructor
	public BarCode (String barOrZip) {

		// check if zip code length
		if (barOrZip.length() == 5) {
			// if string is a valid zip (numeric)
			if (isNumeric(barOrZip))
			{
				myZipCode = barOrZip;
				// initialize myBarCode
				myBarCode = encode(myZipCode); 
			}
			// else set variables to null to trigger error message
			else 
				{
					myBarCode = null;	
					myZipCode = null;
				}
		}

		// check if bar code length
		else if (barOrZip.length() == 32) {
			// check if valid bar code
			if(isValidBarCode(barOrZip))
			{
				myBarCode = barOrZip;
				// initialize myZipCode
				myZipCode = decode(myBarCode); 
			}
			// else set variables to null to trigger error message
			else 
			{
					myBarCode = null;	
					myZipCode = null;
			}	
		}
			else
			{
				myBarCode = null;
				myZipCode = null;
			}
	}

	// getter methods
	public String getBarCode()
	{
		return myBarCode;
	}

	public String getZipCode()
	{
		return myZipCode;
	}

/**
    * This method checks the 32 symbol bar code to determine if it is valid.
 	* The method checks for correct frame bars, correct digit patterns 
 	* and a correct check digit.
    *
    * @param   	barCode  A string representing a bar code
    * @return  	True or False depending on whether input is a valid bar code
    */	
	private boolean isValidBarCode(String barCode)
	{
		// check that start- and end frame bars are in place
		if (barCode.startsWith("|") && barCode.endsWith("|"))
		{
			// build a string to be checked
			StringBuilder digits = new StringBuilder();

			// initialize array of bar segments
			String [] barSegments = new String [6]; // maybe use a constant?

			// counter for bar segments
			int j = 1;

			// populate array
			for (int  i = 0; i < 6; i++)
			{
				barSegments[i] = barCode.substring(j, j + 5);
				j = j+5;
			}

			// decode bar segments and append to string to be checked
			for (int i = 0; i < 6; i++)
			{
				digits.append(codeToDigit(barSegments[i]));
			}

			String s = digits.toString();

			// stores the sum of the zip code digits
			int digitSum = 0;

			// check that all entries are digits and that check digit is correct
			if (isNumeric(s))
				{
					for (int i = 0; i < s.length() - 1; i++)
					{
						digitSum += s.charAt(i);
					}

					// check if the last digit in the string equals check sum
					if (s.charAt(5) == Character.forDigit(getCheckDigit(digitSum), 10))
					{
						return true;
					}
					else return false;
				}
			else return false;
		}
		// either missing start- or end frame bar, or both.
		else return false;
	}

/**
    * This method takes a zip code and returns a bar code
 	* representing the zip code
    *
    * @param   	zipCode  A string representing a zip code
    * @return  	barCode  A string representing a bar code
    */	
	private String encode (String zipCode)
	{
		// this is the check digit in a bar code
		int checkDigit = 0;
		// sum of zip code digits to calculate check digit
		int digitSum = 0;
		// start building bar code
		StringBuilder barCode = new StringBuilder();
		// first frame bar
		barCode.append("|");
		// append 5 bars per zip digit
		for (int i = 0; i < zipCode.length(); i++)
		{
			// lookup bar sequence for a digit
			barCode.append(digitToCode(zipCode.charAt(i)));
			// add digit to check sum
			digitSum += zipCode.charAt(i);
		}
		// calculate check digit
		checkDigit = getCheckDigit(digitSum);
		
		// append check digit bar sequence to bar code
		barCode.append(digitToCode(Character.forDigit(checkDigit, 10)));
		// last frame bar
		barCode.append("|");

		// return the bar code as a string
		return barCode.toString();
	}

	/**
    * This method takes a bar code and returns a zip code
    *
    * @param   	barCode  A string representing a bar code
    * @return  	barCode  A string representing a zip code
    */	
	private String decode (String barCode)
	{
		// start building zip code
		StringBuilder zipCode = new StringBuilder();

		// initialize array of bar segments
		String [] barSegments = new String [5]; // maybe use a constant?

		// counter for bar segments
		int j = 1;

		// populate array
		for (int  i = 0; i < 5; i++)
		{
			barSegments[i] = barCode.substring(j, j + 5);
			j = j+5;
		}

		// decode bar segments and append to zip code string builder
		for (int i = 0; i < 5; i++)
		{
			zipCode.append(codeToDigit(barSegments[i]));
		}

		// return the zip code as a string
		return zipCode.toString();
	}

	/**
    * This method returns a check digit - the integer 0-9 that is necessary 
    * for the sum of the zip code digits to equal the next multiple of 10
    *
    * @param   	sum  an integer which is the sum of the digits in a zip code
    * @return  	int  the check digit
    */	
	private int getCheckDigit(int sum)
	{
		if (sum % 10 != 0) 		// if digitSum is not already a multiple of 10
		{
			return 10 - (sum % 10);
		}
		else return 0;
	}

	/**
    * helper function to lookup the bar sequence corresponding to a zip digit
    *
    * @param   	c 				a digit in a zip code (char)
    * @return  	barSequence  	a string representing a 5-bar sequence
    */	
	private String digitToCode(char c) 
	{
		String barSequence = "";
		switch (c) {
			case '0': barSequence = "||:::";
					break;
			case '1': barSequence = ":::||";
					break;
			case '2': barSequence = "::|:|";
					break;
			case '3': barSequence = "::||:";
					break;
			case '4': barSequence = ":|::|";
					break;
			case '5': barSequence = ":|:|:";
					break;
			case '6': barSequence = ":||::";
					break;
			case '7': barSequence = "|:::|";
					break;
			case '8': barSequence = "|::|:";
					break;
			case '9': barSequence = "|:|::";
					break;
		}
		return barSequence;
	}

	/**
    * helper function to look up the digit corresponding to a bar sequence
    *
    * @param   	s				a bar sequence
    * @return  	zipDigit  		a digit in a zip code (char)
    */	
	private char codeToDigit(String s) 
	{
		char zipDigit = '\0';
		switch (s) {
			case "||:::": zipDigit = '0';
					break;
			case ":::||": zipDigit = '1';
					break;
			case "::|:|": zipDigit = '2';
					break;
			case "::||:": zipDigit = '3';
					break;
			case ":|::|": zipDigit = '4';
					break;
			case ":|:|:": zipDigit = '5';
					break;
			case ":||::": zipDigit = '6';
					break;
			case "|:::|": zipDigit = '7';
					break;
			case "|::|:": zipDigit = '8';
					break;
			case "|:|::": zipDigit = '9';
					break;	
		}
		return zipDigit;
	}

	/**
    * helper function to make sure input zip code is valid
    *
    * @param   	s				A string of digits
    * @return  	True or false depending on whether the string is all digits
    */	
	private boolean isNumeric(String s) {  
        return s.matches("\\d+");  
    } 
}