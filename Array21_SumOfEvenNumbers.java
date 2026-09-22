// Sum even elements

// Count positive elements

import java.util.*;

public class Array21_SumOfEvenNumbers{

    public static void main(String[] args) {

        int[] arr1 = {40, 20, 50, 11, 13, 23, 1};
 
       int sum  = 0;

	System.out.println("Sum of Even Elements");

        for(int i = 0; i < arr1.length; i++)//
        {
            if(arr1[i] % 2 == 0)
	    {
	        sum = sum + arr1[i];		  
	    }

        }

	

	System.out.println(sum);

    }
}
