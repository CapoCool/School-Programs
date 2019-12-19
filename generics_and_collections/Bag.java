package generics_and_collections;

/*
 * Dillan Poorman
 * CSC205
 * 10/25/2019
 * Bag interface 
 */

public interface Bag<T> {
	public boolean isEmpty();
	public int size();
	public void add(T item);

}
