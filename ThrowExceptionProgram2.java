import java.util.*;

class NegativeNumberException extends RuntimeException{

     public NegativeNumberException(String message)
     {
       super(message);

     }

}

public class ThrowExceptionProgram2{

    public static void main(String[] args){

     
     int num = -1; 

     if(num >= 0)
     {
        
	System.out.println("The given number is positive");

     }

     else {

       throw new NegativeNumberException(" You are not eligible for voting ");

       }

    }

 }