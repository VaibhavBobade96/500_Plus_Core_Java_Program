// Count positive elements

import java.util.*;

public class Array18_CountPositiveElements{

    public static void main(String[] args) {

        int[] arr1 = {40, -20, 50, 10, -30, 100, -90, 30, -11, 22, 21, 0, 0, 0, 0};
 
        int count = 0;
	boolean found = false;
	

	System.out.println("Total Positive Elements");

        for(int i = 0; i < arr1.length; i++)//
        {
            if(arr1[i] > 0)
	    {
	      System.out.print(arr1[i] + " ");
	      count++;
		  
	    }
		 
       else if(arr1[i] == 0)
	     {
	       System.out.print(+ arr1[i]);
	       count++;
	 
	     }

        }

	System.out.println();
	System.out.println();

	System.out.println("Total Positive Elements :"+count);

    }
}