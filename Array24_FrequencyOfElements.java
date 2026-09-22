//Frequency of element

import java.util.*;

public class Array24_FrequencyOfElements{

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 50, 10, 50, 20, 20};   // 10=2    20 = 3  50 = 2  
 
       int count  = 0;
	   boolean found = false;
	   int temp = 0;

        for(int i = 0; i < arr1.length; i++)//10
        {
	     count = 0;
		 found = false;
	   for(int k = 0; k < i; k++) // 50
	    {
	     if(arr1[i] == arr1[k]) // 20 == 20
	       {
			  
	           found = true;
			   break;
			
	       }

		   
	   }

	    if(found == true)
			{
		      continue;
			}

	 for(int j = 1+i; j < arr1.length; j++) // 50
	    {
	     if(arr1[i] == arr1[j]) // 20 == 20
	       {
			   count++;
	          
			
	       }

		   
	   }


	  
      
	    System.out.println(arr1[i] + " " +(count+1));
	  
	  }

	

	
    }
}
