
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,2,5,1,3,9,6};
		int size = arr.length;
		
		System.out.println("Array before Bubble Sort:");
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		// Bubble sort
		for (int i = 0; i < size; i++)
		{
			for(int j = 1; j < (size-i); j++){  
                if(arr[j-1] > arr[j]){  
                       //swap elements  
                       int temp = arr[j-1];  
                       arr[j-1] = arr[j];  
                       arr[j] = temp;  
               }
			}
		}
		
		System.out.println("\nArray after Bubble Sort:");
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + " ");
		}
		

	}

}
