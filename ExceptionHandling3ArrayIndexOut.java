//ArrayIndexOutOfBoundsException

public class ExceptionHandling3ArrayIndexOut{

  public static void main(String[] args){

   int arr1[] = {10, 20, 30};

   try{
     
       System.out.print(arr1[5]);

       }

       catch(ArrayIndexOutOfBoundsException e)
       {
         System.out.println("invalid Index");
        }

		System.out.println("Program Continue...");
  
  }
 
}