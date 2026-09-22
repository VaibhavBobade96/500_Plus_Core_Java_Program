
class ArrayUnions{

  public static void main(String[] args){

   int[] arr1 = { 10, 20, 30, 40, 30, 50};
   int[] arr2 = { 20, 30, 40, 30, 70, 80};

   int[] arr3 = new int[arr1.length + arr2.length];
    
    int p = 0;
	
  
   for(int i = 0; i < arr1.length; i++)
    {
        boolean found = false;

      for(int j = 0; j < arr2.length; j++)
        {
	    if(arr1[i] == arr2[j])
	      {
	         found = true;
	          break;
          }
		}

	 if(found == false)
	 {
	      arr3[p] = arr1[i];   // 10 50
	      p++;
	 }
      
  }
    
	
	for(int i = 0 ; i < arr2.length; i++)
	  {
		boolean found = false;

		for(int j = 0; j < p; j++)
			
		  {
			 if (arr2[i] == arr3[j])
			 {
			   found = true;
				 break;
			 }
		  }

		  if(found == false)
		  {
			 arr3[p] = arr2[i];
			 p++;
		  }
     }

    System.out.println("Array Union");
    
	for (int i = 0; i < p; i++)
	{
		System.out.println(arr3[i]);
	}

 }

}