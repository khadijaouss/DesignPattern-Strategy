package Strategy;

public class InsertionSort implements Strategy {

		@Override
		public void sort(Product[] objArray) {
			int n = objArray.length;  
	        for (int j = 1; j < n; j++) {  
	            Product objectToSort = objArray[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( objArray [i].compareTo(objectToSort)>=1 ) ) {  
	            	objArray [i+1] = objArray [i];  
	                i--;  
	            }  
	            objArray[i+1] = objectToSort;  
	        }  
	        System.out.println("After Insertion Sort");    
		    for(int i=0;i<objArray.length;i++){    
		        System.out.print(objArray[i] +" ");    
		    } 
		}


}
