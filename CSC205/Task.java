/* Dillan Poorman
 * CSC205
 * 09/27/2019
 * Parent class, uses interface PrioritizedTask.
 */
package CSC205;

public abstract class Task implements PrioritizedTask {
	
	public int priority;
	
	public Task() {
		priority = 0;
	}
	
	public int getPriority() {
		return this.priority;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public abstract void executeTask();

}
