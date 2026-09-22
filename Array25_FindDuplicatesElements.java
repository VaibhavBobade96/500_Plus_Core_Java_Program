//Find duplicate elements

//Product of elements
//Sum odd elements

import java.util.*;

public class Array25_FindDuplicatesElements{

    public static void main(String[] args) {

        int[] arr1 = {40, 20, 40, 13, 13, 23, 1, 1, 1, 1, 20};
 
       int count = 0;
	   boolean found = false;
	   

	System.out.println("duplicate  Elements");

        for(int i = 0; i < arr1.length; i++)//
        {
			 count = 0;
			 found = false;
	   for(int s = 0; s < i; s++)
	     {
	        if(arr1[i] == arr1[s])
		    {           
				   
             found = true;		   
		     break;
	        }
        }

		if(found == true)
			{
			continue;
	    }

	   for(int j = i + 1; j < arr1.length; j++)
		{
		    if(arr1[i] == arr1[j])
			{  
				count++;
			
			}
		}


			  System.out.println(arr1[i]+ " = " +(count+1));

		}
		



	

	

    }
}
