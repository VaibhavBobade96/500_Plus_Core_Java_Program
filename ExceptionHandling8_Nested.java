//Nested try-catch

public class ExceptionHandling8_Nested{

  public static void main(String[] args){

   try{
    
       try{

             int a = 10;
	     int b = 0;
	     int result = a / b;

	     System.out.println(result);
	    
	    }

       catch(ArithmeticException e1)
	   {
	      System.out.println(" Cannot divided by zeor");
	    }

    } 

    catch(Exception e)
    {
      System.out.println("Outer Excepiton");
    }

    System.out.println("Program Continuee....");

    }
  
  }