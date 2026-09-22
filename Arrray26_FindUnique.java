//Find unique elements

public class Arrray26_FindUnique{

   public static void main(String[] args){

   int[] arr1 = {10, 20, 30, 40, 40, 20, 40, 50, 40, 70};
   
   int count = 0;

   for(int i = 0; i <  arr1.length; i++)//10
   {
	  count = 0;

     for(int j = 0; j < arr1.length; j++)//
     {
       if(arr1[i] == arr1[j])
       {
          count++;
	   }
     }

     if(count == 1)
     {
       System.out.println("This no is unique :" +arr1[i]);
     }

   }
   
  }

}