package generics_and_collections;
/* Dillan Poorman
 * CSC205
 * 10/25/2019
 * My bag class, implements the bad interface
 */
import java.util.ArrayList;

public class MyBag<T> implements Bag<T> {
	
	//create arraylist with abstract data type so you can declare the type late
	ArrayList<T> array = new ArrayList<T>();

	
	@Override
	public boolean isEmpty() {
		
		
		return array.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return array.size();
	}

	@Override
	public void add(T item) {
		
		array.add(item);
		
	}
	
	public void displayArray() {
		
		for(T element : this.array) {
			
			System.out.println(element);
		}
		
	}

}
