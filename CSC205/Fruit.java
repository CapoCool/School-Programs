/*Dillan Poorman
 * CSC205
 * 09/13/2019
 * Simple fruit class that uses the Comparable interface.
 */

package CSC205;

public class Fruit implements Comparable<Fruit>{
	private String fruitName;
	private String fruitDesc;
	private int fruitQty;
	
	//contructor, I am not sure if this was needed, but hey, can't hurt.
	public Fruit() {
		
		fruitName = "";
		fruitDesc = "";
		fruitQty = 0;
	}
	
	//overload
	public Fruit(String fruitName, String fruitDesc, int fruitQty) {
		
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.fruitQty = fruitQty;
	}
	
	//getter for fruit name
	public String getFruitName() {
		
		return this.fruitName;
	}
	
	//setter for fruit name
	public void setFruitName(String fruitName) {
		
		this.fruitName = fruitName;
	}
	
	//getter for fruit quality
	public String getFruitDesc() {
		
		return this.fruitDesc;
	}
	
	//setter for fruit 
	public void setFruitDesc(String fruitDesc) {
		
		this.fruitDesc = fruitDesc;
	}
	
	//getter for fruit quantity
	public int getFruitQty() {
		
		return this.fruitQty;
	}
	
	//setter for fruit quantity
	public void setFruitQty(int fruitQty) {
		
		this.fruitQty = fruitQty;
	}
	
	//compare to method
	public int compareTo(Fruit o){
		if(o.getFruitName().compareTo(this.getFruitName()) != 0) {
			return this.getFruitName().compareTo(o.fruitName);
		} else {
			int compareQty = ((Fruit) o).getFruitQty();
			
			return this.getFruitQty() - compareQty;
		}
	}
	
	//to string method
	public String toString() {
		return ("Fruit [fruitName=" + this.fruitName + ", fruitDesc=" + this.fruitDesc + ", fruitQty=" + this.fruitQty + "]"+ "\n");
	}
	
}
