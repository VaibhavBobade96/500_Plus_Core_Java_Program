import java.util.Scanner;

public class ExceptionHandling5{

   public static void main(String args[]){

     try {

         int arr1[] = {10, 20, 30};

	int result = arr1[2] / 0;

	}

      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Array Index Exception");
      }

      catch(NullPointerException e)
      {
         System.out.println(" String is Null");
      }

      catch(ArithmeticException e)
      {
         System.out.println(" Arithmetic Exception");
      }
   
   }

  }




