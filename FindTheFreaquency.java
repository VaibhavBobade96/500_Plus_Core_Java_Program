
class FindTheFreaquency{

    public static void main(String[] args){
     

     int arr[] = {10, 34, 53 ,23 ,54, 54, 34, 23, 34, 45, 34};

     int count = 0;

     for(int i = 0; i < arr.length; i++)
     {
	    count = 0;
       for(int j = 0; j < arr.length; j++)
       {
          if(arr[i] == arr[j])
	    {
	       count++;
	    }
	}

	System.out.println(arr[i] + " = " +count);

     }

   }

 }

 