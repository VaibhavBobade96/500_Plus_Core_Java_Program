//Second largest

public class Array8_SecondLargest{

  public static void main(String[] args){

   int[] arr1 = { 10, 20, 50, 40, 30};

   int seclarge = arr1[0];//10
   int large = arr1[0];   //10


// large 
   for(int i = 0; i < arr1.length; i++)
	{
     if(arr1[i] > large)
     {
        large = arr1[i];
     }
   }

// seclarge
   for(int j = 0; j < arr1.length; j++)
   {
	   if(arr1[j] > seclarge && arr1[j] < large) 
	   {
		   seclarge = arr1[j];
	   }
   }

   System.out.println("maximum No :" +seclarge);

  }

}