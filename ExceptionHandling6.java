import java.util.*;

public class ExceptionHandling6{

  public static void main(String[] args){
  
     try{
        
	 int a = 20;
	 int b = 10;
	 int result = a / b;

	 System.out.println(result);

	}

   catch(ArithmeticException e){

      System.out.println("Can not divided By Zero");

      }

   finally{
     
      System.out.println("Finally Block Always Excecute");

      }


     }
   

   }
