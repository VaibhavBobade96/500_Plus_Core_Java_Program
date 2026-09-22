
class FindTheMaxNo{

   public static void main(String[] args){

    int arr[] = {19, 20, 48, 49, 100, 41, 38};

    int max = 0;
	int secMax = 0;

    for(int i = 0; i < arr.length; i++)
    {
      if(arr[i] > max)
      {
         max = arr[i];
	     i++;
      }
     }

     System.out.println(max);

	 for (int j = 0; j < arr.length; j++)
	 {
		 if (arr[j] > secMax && arr[j] < max)
		 {
			 secMax = arr[j];
		 }
	 }

	 System.out.println("Second Max No :" +secMax);
    }

 }