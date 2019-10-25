package stack_operations;

/**
 * Dillan Poorman
 * CSC205
 * 10/25/2019
 * Empty collection exception
 */
public class EmptyCollectionException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Sets up this exception with an appropriate message.
	 * @param collection the name of the collection
	 */
	public EmptyCollectionException()
	{
		super("The stack is empty. Containing no elements");
	}
}