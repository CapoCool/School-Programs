package sorting;

/*Dillan Poorman
 * 12/07/2019
 * CSC205
 * Sorting algorithm class, doesn't use generic. 
 * 
 */
public class SortingAlgorithms {
	
	public void selectSort(Integer[] target) {
		
		int n = target.length;
		
		//move boundary of unsorted subarray
		for (int i = 0; i < n-1; i ++) {
			
			//find minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++) {
				if(target[j] < target[min_idx]) {
					min_idx = j;
				}
			}
			
			int temp = target[min_idx];
			target[min_idx] = target[i];
			target[i] = temp;
		}
	}
	
	public void insertSort(Integer[] target) {
		int n = target.length;
		
		for(int i = 1; i < n; i++) {
			
			int key = target[i];
			int j = i - 1;
			
			//move elements of array i-1, that are greater than key, 
			//to one position ahead of their current position
			
			while(j >= 0 && target[j] > key) {
				target[j + 1] = target[j];
				j= j-1;
			}
			target[j + 1] = key;
		}
	}
	
	public void bubbleSort(Integer[] target) {
		 int n = target.length;
		 for(int i = 0; i < n-1; i++) {
			 for (int j = 0; j < n-i-1; j++) {
				 if (target[j] > target[j + 1]) {
					 
					 //swap target[j + 1] and target[i]
					 int temp = target[j];
					 target[j] = target [j + 1];
					 target[j + 1] = temp;
				 }
			 }
		 }
	}
	
	public void merge(Integer[] target, Integer l, Integer m, Integer r) {
		
		//Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		
		//creates temp array
		int L[] = new int [n1];
		int R[] = new int [n2];
		
		//copy data from temp array
		for (int i = 0; i < n1; i++) {
			L[i] = target[l + i];
		}
		for(int j = 0; j < n2; j++) {
			R[j] = target[m + 1 + j];
		}
		
		//merge the temp arrays
		
		//Initial indexes of first and second subarrays
		int i = 0, j = 0;
		
		//initial index of merged subarray array
		int k = l;
		while(i < n1 && j < n2) {
			
			if(L[i] <= R[j]) {
				
				target[k] = L[i];
				i++;
			}
			else {
				
				target[k] = R[j];
				j++;
			}
			
			k++;
		}
		
		//copy remaining element of L[] if any
		while (i < n1) {
			target[k] = L[i];
			i++;
			k++;
		}
		
		//copy remaining elements of R[] if any
		while (j < n2) {
			target[k] = R[j];
			j++;
			k++;
		}
	}
	
	public void mergeSort(Integer[] target, Integer l, Integer r) {
		
		if (l < r) {
			
			//find middle point
			int m = (l + r)/2;
			
			//sort first and second halves
			mergeSort(target, l, m);
			mergeSort(target, m + 1, r);
			
			//merge the sorted halve
			merge(target, l, m, r);
		}
	}
	
	//quick sort method
	public int partition(Integer[] target, Integer low, Integer high) {
		int pivot = target[high];
		int i = (low-1); // index of smaller element
		for(int j = low; j < high; j++) {
			
			//if current element is smaller than the pivot
			if(target[j] < pivot) {
				i++;
				
				//swap target[i] and target[j]
				int temp =  target[i];
				target[i] = target[j];
				target[j] = temp;
			}
		}
		
		//swap target[i + 1] and target[high] (or pivot)
		int temp = target[i + 1];
		target[i + 1] = target[high];
		target[high] = temp;
		
		return i + 1;
	}
	
	public void quickSort(Integer[] target, Integer low, Integer high) {
		
		if(low < high) {
			
			//pi is partitioning index, target[pi] is now at right place
			int pi = partition(target, low, high);
			
			//sort elements before and after partition using recursion
			quickSort(target, low, pi-1);
			quickSort(target, pi + 1, high);
			
		}
	}

}
