/* Dillan Poorman
 * CSC205
 * 09/30/2019
 * Invalid employee number exception class 
 * 
 */

package exceptions_hospital_employee;

public class InvalidEmpNumberException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmpNumberException(){
		super();
	}
	
	public InvalidEmpNumberException(int empNum) {
		
		super("Negative Value: " + empNum);

	}

}