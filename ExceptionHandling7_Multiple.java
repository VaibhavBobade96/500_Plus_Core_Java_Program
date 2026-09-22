//Multiple catch

public class ExceptionHandling7_Multiple{

   public static void main(String[] args){

   try{

       int a = 10; 
       int b = 0; 
       int result = a / b;

       System.out.println(result);
      
      }

   catch(ArrayIndexOutOfBoundsException e)
   {
      System.out.pritnln("Invalid index of array..");
   }

   Catch(StringIndexOutOfBoundsException e)
   {
    
      System.out.println("Invalid index of String...");
   
   }

   catch(ArithmeticException e)
   {
      System.out.println("Cannot divided by zero");
   }

   System.out.println("Program Continue...");
  
  }

}