/*
 *Dillan Poorman
 *CSC205
 *09/30/2019
 *Custom Exception class.
 */
package exception_operations;

/**
 * Custom exception class.
 * 
 * @author 
 *
 */
public class DenominatorIsZeroException extends Exception {

	/**
	 * Needed because one of this classes parents is @see Serializable.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Add default Constructor.
	 */
	public DenominatorIsZeroException(){
		
		super();
	}
	
	/**
	 *  Add Constructor with Parameter
	 * 
	 * @param message
	 */
	public DenominatorIsZeroException(String message) {
		
		super(message);
	}
	
	
	
	
	
}
