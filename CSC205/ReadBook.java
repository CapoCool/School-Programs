/* Dillan Poorman
 * CSC205
 * 09/27/2019
 * Read book class, prioritizes read book to 3.
 */

package CSC205;

public class ReadBook extends Task {
	
	public ReadBook() {
		super();
	}
	
	@Override
	public void setPriority() {
		// TODO Auto-generated method stub
		priority = 3;
	}

	@Override
	public void executeTask() {
		// TODO Auto-generated method stub
		System.out.println("Reading book...");
	}
	
	public void browseLibrary() {
		System.out.println("Browsing library...");
	}

}
