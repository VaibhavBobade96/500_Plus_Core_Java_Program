//Maximum element

public class Array6_maximumElement{

  public static void main(String[] args){

   int[] arr1 = { 10, 20, 50, 40, 30};

   int max = arr1[0];

   for(int i = 0; i < arr1.length; i++)
   {
     if(arr1[i] > max)
     {
        max = arr1[i];
     }
   }

   System.out.println("maximum No :" +max);

  }

}