/* Dillan Poorman
 * CSC205
 * 09/30/2019
 * invalid name exception class
 * 
 */
package exceptions_hospital_employee;

public class InvalidNameException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException() {
		super("Invalid Name");
	}

}
