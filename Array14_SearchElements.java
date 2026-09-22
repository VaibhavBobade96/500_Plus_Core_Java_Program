import java.util.*;

public class Array14_SearchElements{

    public static void main(String[] args) {

        int[] arr1 = {40, 20, 50, 10, 30};

        int search = 10;

        for(int i = 0; i < arr1.length; i++)//
        {
            if(arr1[i] == search)
	    {
	      System.out.println("Found array element :" +arr1[i] + " Position of Index : " +i);
	      break;
        }
	   
		}
    }
}