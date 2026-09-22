//Sort array

import java.util.Arrays;

public class Array12_ArraySort{

  public static void main(String[] args){

   int[] arr1 = { 20, 40, 50, 10, 30};

     Arrays.sort(arr1);

	 for(int i = 0; i < arr1.length; i++)
	  {
		 System.out.print(arr1[i] + " ");
	  }

	  System.out.println();
    
  }

}