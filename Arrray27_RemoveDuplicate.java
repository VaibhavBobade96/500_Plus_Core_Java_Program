// Remove duplicates

public class Arrray27_RemoveDuplicate{

   public static void main(String[] args){

   int[] arr1 = {10, 20, 30, 40, 40, 20, 40, 50, 40, 70};//10 20 30 40 50 70 
   
   int count = 0;    
   boolean duplicate = false;

   for(int i = 0; i <  arr1.length; i++)//40
   {
	  count = 0;
	 duplicate = false;

	 for(int k = 0; k < i;  k++)
	   {
          if(arr1[i] == arr1[k])
		   {
			  duplicate = true;
			  break;
		   }

	   }

	   if(duplicate == true)
	   {
		   continue;
	   }

     for(int j = i + 1; j < arr1.length; j++)//20
     {
       if(arr1[i] == arr1[j])// 10 == 20
       {
          count++;
	   }
     }
	  
	  System.out.print(arr1[i] + " ");
	
   }

      System.out.println();
  }

}