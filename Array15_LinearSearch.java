import java.util.*;

public class Array15_LinearSearch{

    public static void main(String[] args) {

        int[] arr1 = {40, 20, 50, 10, 30};

        int key = 30;

	boolean found = false;

        for(int i = 0; i < arr1.length; i++)//
        {
            if(arr1[i] == key)
	    {
	      System.out.println("Found array element :" +arr1[i] + " Position of Index : " +i);
	      found = true;
	      break;
        }

		}

	if(found == false)
	{
	   System.out.println(" Element Not Found in These Array ");
	   
     }
    }
}