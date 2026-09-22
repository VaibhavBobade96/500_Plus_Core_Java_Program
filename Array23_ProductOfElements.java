//Product of elements
//Sum odd elements

import java.util.*;

public class Array23_ProductOfElements{

    public static void main(String[] args) {

        int[] arr1 = {40, 20, 50, 11, 13, 23, 1};
 
       int product  = 1;

	System.out.println("Sum of Even Elements");

        for(int i = 0; i < arr1.length; i++)//
        {
	     product = product * arr1[i];		  
        }

	

	System.out.println(product);

    }
}
