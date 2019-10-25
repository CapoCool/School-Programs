/* Dillan Poorman
 * CSC205
 * 09/30/2019
 * invalid pay rate exception class
 * 
 */
package exceptions_hospital_employee;

public class InvalidPayRateException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidPayRateException() {
		super();
	}
	
	public InvalidPayRateException(double payRate) {
		
		super("Invalid Pay Rate: " + payRate);
	}

}
