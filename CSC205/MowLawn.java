/* Dillan Poorman
 * CSC205
 * 09/27/2019
 * Mow lawn class, prioritizes task to 2
 */
package CSC205;

public class MowLawn extends Task {
	
	public MowLawn() {
		super();
	}

	@Override
	public void setPriority() {
		// TODO Auto-generated method stub
		priority = 2;
	}

	@Override
	public void executeTask() {
		// TODO Auto-generated method stub
		System.out.println("Mowing lawn...");
	}

}
