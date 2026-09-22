//Basic try-catch

public class ExceptionHandling1BasicTryCatch{

public static void main(String args[]){
  
  try{

     int a = 10;
     int b = 0;

     int result = a / b;

     System.out.println(result);
     
     }

     catch(ArithmeticException e1)
     {

       System.out.println("Cannot divided by zero");

     }

	 System.out.println("program Continues...");

  }

}