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
	 * The history of operations performed by the adding machine.
	 */
	private String history;
	
	/**
	 * Constructs a new AddingMachine object with an initial total of 0 and an
	 * initial operating history of "0".
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the total of all calculations.
	 * @return the total of all calculations.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the specified value to the total and updates the operation
	 * history.
	 * @param value the value to add to the total.
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts the specified value from the total and updates the operation
	 * history.
	 * @param value the value to subtract from the total.
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * Returns the history of operations performed on the total.
	 * @return the history of operations performed on the total.
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Resets the total to zero and clears the operational history.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
