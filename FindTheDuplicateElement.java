import java.util.Scanner;

public class FindTheDuplicateElement{

  public static void main(String[] args){

   int arr[] = {10, 31, 29, 45 , 20, 10, 30};
              // 0   1  2   3    4    5   6
   
   boolean DuplicateFound = false;

   for(int i = 0; i < arr.length; i++)
   {
	 for (int j = 1 + i; j < arr.length; j++ )
	 {
		 if(arr[i] == arr[j])
		 {
		   System.out.println("Find the duplicate values :" +arr[i]);
           DuplicateFound = true;

		   break;
		   
		 }
	 }

   }
    
      if(DuplicateFound == false)
	  {
	    System.out.println("No any Duplicate Value In This Array ");
   }

  }

}

