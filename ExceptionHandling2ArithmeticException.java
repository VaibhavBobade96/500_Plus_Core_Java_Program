//ArithmeticException

public class ExceptionHandling2ArithmeticException{

   public static void main(String args[]){
	     
    int a = 10;
	int b = 0;

	

   try{
     

	
     int c = a / b;
	System.out.println(c);
      }

     catch(ArithmeticException e1)
     {
       System.out.println("Cannot divided by zero");

     }

	 System.out.println("program continue..");

  }

}