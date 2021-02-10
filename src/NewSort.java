
public class NewSort {

	public static void main(String[] args) {
		int [] arr = {10,2,5,1,3,9,6};
		int size = arr.length;
		
		System.out.println("Array before Insertion Sort:");
		
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		 for (int j = 1; j < size; j++) {  
	            int key = arr[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( arr [i] > key ) ) {  
	                arr [i+1] = arr [i];  
	                i--;  
	            }  
	            arr[i+1] = key;  
		 }
		 
		 System.out.println("\nArray after Insertion Sort:");
			
			for (int i = 0; i < size; i++)
				System.out.print(arr[i] + " ");
			
	}

}
