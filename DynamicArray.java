package com.qait.automation.tanuj_sir_test;

public interface DynamicArray {
	
	//Do not use predefined methods

	/**
	 * <ol>
	 * <li>Method return index position of the provided number . If the number is
		not found, it returns -1.</li>
	 * @param searchingNum
	 * @return
	 */
	public int search(int searchingNum);
	
		/**
		 * The Method insert the provided method in the array and follow below constraints
		 * <ul>
		 * <li>The method checks if the integer specified by the parameter exists in the array (This can be
			done using the search method to see if it returns -1 or not) and also checks if the array has
			not reached its capacity.</li>
		 * <li>If both are satisfied, the number is added to the array at the
				smallest available index.</li>
		  * <li>If the array reached its capacity, double its size by calling the
				method doubleCapacity() and add the number</li>
		  * <li>If the number is added successfully,then the method returns true</li>
		  * <li>If the number already exists in the array, the new number will not be added, and the method returns false.</li>
		  * </ul>
		 * @param numberToAdd
		 * @return
		 */
	public boolean add (int numberToAdd);
	
	
	/**
	 * It is a service (helper) method and doubles the capacity of the array (numArray).
	 */
	public void doubleCapacity();
	
	
	/**
	 * <ol>
	 * <li>The method checks if the integer specified by the parameter exists in the array (This can be
		done using the search method to see if it returns -1 or not) </li>
		<li> and if it does, it deletes the number by shifting numbers to the left and
	    it returns true. Otherwise, it returns false.</li>
	 * @param numberToRemove
	 * @return
	 */
	public boolean remove(int numberToRemove);
	
	
	/**
	 * Returns the number of elements added so far to the array numArray.
	 * @return
	 */
	public int getCount();
	
	/**
	 * <ol>
	 * <li> The method takes an integer rotation amount and items of numArray moved backward by n positions. </li>
		<li>For example, suppose numArray contains the following items in
		sequence:
		{4,5,-4,-5,54,95,-14,-15}
		After rotating by 2, the elements in the new array will appear in this sequence:
		{-4,-5,54,95,-14,-15,4,5} </li>
			 * @param n
	 * @return
	 */
	public int[] rotate (int n);
	
	/**
	 * Returns a String containing a list of numbers stored in the numArray. An example of such
		string can be:
		{3, 6, -1, 3, 23, -50, 43}
		The string should start with a '{' and end with a '}'.
	 * @return
	 */
	public String toString( );
	
	
	
}
