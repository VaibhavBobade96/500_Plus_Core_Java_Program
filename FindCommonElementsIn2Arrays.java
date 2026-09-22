

class FindCommonElementsIn2Arrays{

  public static void main(String[] args){

    int arr1[] = {1, 2, 45, 23, 12, 8, 9, 49, 43};
    int arr2[] = {4, 23, 89, 34, 2, 19, 34, 90, 43}; // 2, 23

	System.out.println("Found Common Elements :");

    boolean found = false;

    for(int i = 0; i < arr1.length; i++) //1
     {
        found = false;

      for(int j = 0; j < arr2.length; j++)  
       {
          if(arr1[i] == arr2[j])   // 1 == 4
	  {
	     found = true;
	     break;
	  }

	}

      if(found == true)
      {
        System.out.println(arr1[i]);
       }

    }

  }

}
