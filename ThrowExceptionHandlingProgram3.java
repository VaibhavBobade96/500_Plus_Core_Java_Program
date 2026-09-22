import java.util.*;

class InvalidMarksException extends RuntimeException{

  InvalidMarksException(String message)
   {
       super(message);

    }

 }

 public class ThrowExceptionHandlingProgram3{

     public static void main(String[] args){

       int marks = 1243;

       if(marks > 100 || marks < 0)
       {
           throw new InvalidMarksException(" Invalid Marks ");

       }

       else{

           System.out.println("you Entere the Valid Marks");
	   
	   }

   }


}
      