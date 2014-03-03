// King.java

/** 
 *  Provides a method for determining what locations are under attack
 *  by the king on a chess board.
 *	
 *  @author:  Anna Ntenta, anna.ntenta@gmail.com
 *  @version: Last Modified 3/3, 2014
 */

class King extends Piece
{
	/**
	* Takes a row- and column index and determines if the square
	* in that location on the chess board is under attack by the king
	*
	* @param  	indexRow	index of current row
	* @param	indexColumn	index of current column
    * @return  	True or False depending on whether this location is under attack
	*/
    boolean attackingThisLocation (int indexRow, int indexColumn)
    {
      int columnDiff = pieceColumn - indexColumn;
      int rowDiff = pieceRow - indexRow;

      // all rows and columns that are exactly one square away are under attack
      if (((columnDiff <= 1) && (columnDiff >= -1)) && ((rowDiff <= 1) && (rowDiff >= -1)))
      	return true;
      	else return false;
     }
 }
