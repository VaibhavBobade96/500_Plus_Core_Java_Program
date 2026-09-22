//Try-finally // is

public class ExceptionHandling10_TryFinally{

  public static void main(String[] args){

   try{

	   System.out.println("database, files connection open ");
        int a = 10; 
	int b = 0;
	int result = a / b;

	System.out.println(result);
       }

    finally{
        
	 System.out.println("Always Executed Block");

	 System.out.println("Database Connecion, files Close");

	 }


  }


}