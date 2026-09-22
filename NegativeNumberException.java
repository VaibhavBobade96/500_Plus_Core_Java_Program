import java.util.*;

class NegativeNumberException extends RuntimeException{

     public NegativeNumberException(String msg)
     {
       super(msg);

     }

}

public class ThrowExceptionProgram2{

    public static void main(String[] args){

     
     int num = 5; 

     if(num >= 0)
     {
        
	System.out.println("The given number is positive");

     }

     else {

       throw new NegativeNumberException(" ");

       }

    }

 }