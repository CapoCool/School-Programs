/* Dillan Poorman
 * CSC205
 * 09/27/2019
 * Driver class for the other classes
 * 
 */
package CSC205;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 
 *   @version 1.1
 * Driver for Module 6 project 1 
 * Demonstrates using abstract classes with interfaces.
 * <p>
 * Do NOT change this driver.
 * <p>
 * Output should look like...
 * <pre>
 *   Doing homework...
 *   Mowing lawn...
 *   Browsing library...
 *   Reading book...
 * </pre>
 * <pre>
 *  Output:
 * 		Doing homework....
 * 		Mowing lawn...
 * 		Browsing library...
 * 		Reading book...
 * </pre>
 */
public class TaskDriver {

    public static void main(String[] args) {

        PrioritizedTask homework = new DoHomework();
        PrioritizedTask mowLawn = new MowLawn();
        PrioritizedTask readBook = new ReadBook();

        List<PrioritizedTask> tasks = new ArrayList<>();

        tasks.add(homework);
        tasks.add(mowLawn);
        tasks.add(readBook);

        for (PrioritizedTask task : tasks) {
            if (task instanceof ReadBook) {
                ((ReadBook) task).browseLibrary(); // narrowing cast
            }
            ((Task) task).executeTask();  // polymorphic method call using narrowing cast
        }

    }
}