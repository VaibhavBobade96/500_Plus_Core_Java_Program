import java.util.Scanner;

 class RemoveDupliElement{

   public static void main(String[] args){

   int arr[] = {88, 23, 12, 45, 23, 34, 12, 56, 88, 34};

   for(int i = 0; i < arr.length; i++)
   {
	   boolean duplicate = false;

     for(int j = 0; j < i; j++)
      {
         if(arr[i] == arr[j])  // 45 = 88
	    {
		   duplicate = true;
		   break;
	    }

      }

	  if(duplicate==false)

	   {
          System.out.println(arr[i] + "  ");
	   }

   }

 }

}
	   
// 88 23 12	   