// Find missing number

public class Arrray28_FindMissing{

   public static void main(String[] args){

   int[] arr1 = {10, 20, 30, 40, 60};
   
   int count = 0;
   int asum = arr1[0] + 10;//20

   System.out.println("Missing Element");

   for(int i = 0; i <  arr1.length-1; i++)//10
   {
      asum = arr1[i] + 10;

      if(arr1[i + 1] != asum)
      {
         System.out.print(+asum);
      }

     
    }

	System.out.println();

    
  }

}