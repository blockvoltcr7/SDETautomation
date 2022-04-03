package Programs_IQ;

import org.testng.annotations.Test;

public class Sorting {

	
	@Test()
	public void bubbleSort() {
		
		doBubbleSort();
		
	}
	
	
	 public static void doBubbleSort() {
	        
	    	int array[] = {10, 8, 12, 9, 6, 7}; 
	    	
	        System.out.println("original array---{10, 8, 12, 9, 6, 7};  ");
	        
	    	int temp; //temp storage object in order to swap values
	        for (int i = 0; i< array.length;i++) { //get the size of the array and start at index 0.. i checks index 0

	            for (int j = i+1; j< array.length; j++) { //j has to be one step above i at all times....  i + 1 this check the next index after i

	                if (array[i] > array[j]) { // if index of i of the array is greater than j which is the second index next to i
	                    temp = array[i]; //setting i to temp sending the index 0 to temp
	                    array[i] = array[j]; //this is a swap
	                    array[j] = array[i]; //this is a swap again
	                    array[j] = temp;

	                }
	            }
	           
	            System.out.println("after: --- " + i + "---iteration");
	           
	            for (int n = 0; n<array.length;n++) {
	                System.out.println(array[n] + ",");

	            }

	            System.out.println("\n");
	        }

	    }

}
