//Second Smallest

public class Array9_SecondSmallest{

  public static void main(String[] args){

   int[] arr1 = { 10, 40, 50, 30, 20};

   int secsmall = arr1[1];//10
   int small = arr1[0];   //10


// small
   for(int i = 0; i < arr1.length; i++)
	{
     if(arr1[i] < small)
     {
        small = arr1[i];
     }
   }

// seclarge
   for(int j = 0; j < arr1.length; j++)
   {
	   if(arr1[j] > small && arr1[j] < secsmall) 
	   {
		   secsmall = arr1[j];//10
	   }
   }

 
   System.out.println("Smallest No : " +small);

   System.out.println("Second Small Number  :" +secsmall);

  }

}