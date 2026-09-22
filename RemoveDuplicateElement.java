import java.util.Scanner;

public class RemoveDuplicateElement{

   public static void main(String[] args){

   int arr[] = {88, 23, 12, 45, 23, 34, 12, 56, 88, 34};



   for(int i = 0; i < arr.length; i++)
   {
     for(int j = 1; j < arr.length; j++)
      {
         if(arr[i] != arr[j])
	 {
	   System.out.println(arr[i]);

	  }
       
      }

   }

 }

}
	   -
	   