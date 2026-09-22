// Binary Search

import java.util.*;
import java.util.Arrays;

public class Array16_BinarySearch{

    public static void main(String[] args) {

        int[] arr1 = {40, 20, 50, 10, 30, 60, 70};

	Arrays.sort(arr1);
         
    int key = 50;
	int low = 0;
	int high = arr1.length-1;
	boolean found = false;

	
     while(low <= high)
	{
	  int mid = (low + high) / 2;

	  if(arr1[mid] == key)
           {
	      System.out.println("Found array element :" +arr1[mid] + " Position of Index : " +mid);
	      found = true;
	      break;
          }
	  else if(key > arr1[mid])
	        {
                low = mid + 1;
	     	}

           else{
	           high = mid - 1;
	       }
	   
	 }

	if(found == false)
	{
	   System.out.println(" Element Not Found in These Array ");
	   
     }
    }
}