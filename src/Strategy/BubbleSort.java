package Strategy;

public class BubbleSort implements Strategy {

	@Override
	public void sort(Product[] objArray) {
		  int n = objArray.length;  
	        Product temp; 
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(objArray[j-1].compareTo(objArray[j])>=1){  
	                                 //swap elements  
	                                 temp = objArray[j-1];  
	                                 objArray[j-1] =objArray[j];  
	                                 objArray[j] = temp;  
	                         }  
	                          
	                 }  
		
	}
	         System.out.println("After Bubble Sort");    
	 	    for(int i=0;i<objArray.length ;i++){    
	 	    	System.out.print(objArray[i] +" ");    
	 	    } 
	}
	}
