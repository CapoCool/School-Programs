/* Dillan Poorman
 * CSC205
 * 09/27/2019
 * Do homework class, prioritizes task to one and stuff.
 */
package CSC205;

public class DoHomework extends Task {
	
	public DoHomework() {
		super();
	}

	@Override
	public void setPriority() {
		priority = 1;
		
	}
	
	@Override
	public void executeTask() {
		System.out.println("Doing Homework...");
		
	}


}
