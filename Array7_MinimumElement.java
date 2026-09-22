//Minimum element

public class Array7_MinimumElement{

  public static void main(String[] args){

   int[] arr1 = { 10, 20, 50, 40, 30};

   int min = arr1[0];

   for(int i = 0; i < arr1.length; i++)
   {
     if(arr1[i] < min)
     {
        min = arr1[i];
     }
   }

   System.out.println("maximum No :" +min);

  }

}