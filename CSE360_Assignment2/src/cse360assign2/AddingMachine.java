// Name:		Alexander Corsi
// Assignment:	2
// Description:	Basic adding machine class for integers


package cse360assign2;

/**
 * Provides a basic adding machine for computing with integers. Maintains a
 * history of the operations performed to achieve the total. Can be cleared
 * by the user.
 * @author aaaco
 */
public class AddingMachine {
	/**
	 * The total of all calculations.
	 */
	private int total;
	
	/**
	 * Constructs a new AddingMachine object with an initial total of 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total of all calculations.
	 * @return the total of all calculations.
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the specified value to the total.
	 * @param value the value to add to the total.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the specified value from the total.
	 * @param value the value to subtract from the total.
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Returns the history of operations performed on the total.
	 * @return the history of operations performed on the total.
	 */
	public String toString () {
		return "";
	}
	
	/**
	 * Resets the total to zero and clears the operational history.
	 */
	public void clear() {
		
	}
}
