package stack_operations;

/**
 * Dillan Poorman
 * CSC205
 * 10/25/2019
 * Full collection exception
 */
public class FullCollectionException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Sets up this exception with an appropriate message.
	 * @param collection the name of the collection
	 */
	public FullCollectionException(int collection)
	{
		super("The stack is Full. Containing " + collection + " elements");
	}
}