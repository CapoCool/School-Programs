package linked_list_stack;

import java.util.ListIterator;
import java.util.Random;

public class DLLDriver {
	
	public static void main(String[] args) {
		
		
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
		ListIterator<Integer> iter = dll.iterator();
		Random rand = new Random();

		dll.add(13);
		dll.add(4);
		dll.add(53);
		dll.add(23);
		dll.add(2);
		dll.add(3);
		dll.add(47);
		dll.add(74);
		
		
		while(iter.hasNext()) {
			
			
			System.out.print(iter.next());
		}
		
		
		
;	}

}
