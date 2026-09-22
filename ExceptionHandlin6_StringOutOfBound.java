//StringIndexOutOfBoundsException

public class ExceptionHandlin6_StringOutOfBound{

   public static void main(String[] args){

    try{
       
        String str = "vaibhav";

	    System.out.println(str.charAt(9));

      }

      catch(StringIndexOutOfBoundsException e)
      {
        System.out.println("Invalid Index...");
      }
     
      System.out.println("Program Continue..");

    }

 }