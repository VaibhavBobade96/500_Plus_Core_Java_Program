import java.util.*;

public class FindTheFrequency4{

  public static void main(String[] args){

     char arr1[] = {'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd', 'a'};

 int count = 1;

     for(int f = 0; f < arr1.length; f++)  // d
     {  
		 count = 0;

		 boolean alreadyExist = false;

		 for (int e = f+1; e < arr1.length; e++) // c
	     {
			 if(arr1[f] == arr1[e])    // b == a
			 {
                 alreadyExist = true;
				 break;
			 }
	     }

	if (alreadyExist = true)
	{
		 continue;
	}
         
	  for(int s = 0; s < arr1.length; s++) // a = a 
	  {
         if(arr1[f] == arr1[s]) // b == b
	     {
             count++;    //
		
	     }

	  }

	  System.out.println(arr1[f] + " = " +count);

   }

 }

  //  b = 2
//	c = 2
//	d = 2
//	a = 3
}

    