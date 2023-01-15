package Strategy;

public class SelectionSort implements Strategy {
	
	@Override
	public void sort(Product[] objArray) {
		for (int i = 0; i <objArray.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < objArray.length; j++){  
                if (objArray[index].compareTo(objArray[j])>=1){  
                    index = j;//searching for lowest index  
                }  
            }  
            Product smallerNumber = objArray[index];   
            objArray[index] =objArray[i];  
            objArray[i] = smallerNumber;  
        }  
		
		
		System.out.println("After Selection Sort");    
		for(int i=0;i<objArray.length ;i++){    
 	    	System.out.print(objArray[i] +" ");    
 	    } 
	}
	
}
