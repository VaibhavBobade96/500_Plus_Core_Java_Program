//Finally block

public class ExceptionHandling9_finally{

  public static void main(String[] args){

   
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

       finally{
              System.out.println(" Always Executed");
	      }

	 }

    } 

   