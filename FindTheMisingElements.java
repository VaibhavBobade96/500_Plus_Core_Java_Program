class FindTheMisingElements{
 
    public static void main(String[] args){

     int arr[] = {1,2,3,5,6,7,8,10};// 4 //9

     boolean found = false;

     for(int i = 1; i <= 10; i++)
      {
         found = false;

	 for (int j = 0; j < arr.length; j++)
	  {
	    if(i == arr[j])
	    {
	      found = true;
	      break;

	     }
	  }
	
       if(found == false)
       {
         System.out.println(i);
	   }

	 }
 
   }


}


       