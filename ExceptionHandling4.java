import java.util.Scanner;

public class ExceptionHandling4{

  public static void main(String[] args){

    try{

         String Name = "abc";

	 int number = Integer.parseInt(Name);

	 System.out.println(number);

	}
 
   catch(NumberFormatException e){

         System.out.println("Invalid Number Format");

	 }

      }
   
  }
