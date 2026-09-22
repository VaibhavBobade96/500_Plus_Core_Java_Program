//Reverse array

public class Array9_ReverseArray{

  public static void main(String[] args){

   int[] arr1 = { 10, 20, 30, 40, 50};

   int i = 0; 
   int j = arr1.length-1; 
   int temp = 0;

   while(i < j)
   {
     temp = arr1[i];
     arr1[i] = arr1[j];
     arr1[j] = temp;
     
     i++;
     j--;
  }


  for(int k = 0; k < arr1.length; k++)
  {
    System.out.print(arr1[k] + " ");
   }


   }

}