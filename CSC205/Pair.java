package CSC205;

public class Pair<T> {
	
	private T first;
	private T second;
	
	//constructor that sets globals to null
	public Pair() {
		this.first = null;
		this.second = null;
	}
	
	//overload constructor
	public Pair(T firstItem, T secondItem) {
		this.first = firstItem;
		this.second = secondItem;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
	public Boolean equals(Pair<T> otherPair) {
		
		if (this.first == otherPair.first && this.second == otherPair.second) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public String toString() {
		
		return this.getFirst() + " " + this.getSecond() ;
	}

}
