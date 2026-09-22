import java.util.*;

public class ExceptionHandling7{

 public static void main(String args[]){

   try{

       int age  = 19;

       if( age < 18)
       {
          throw new ArithmeticException("Not Eligible For Voting");
	}

	System.out.println("Eligible for voting..");

   }

   catch(ArithmeticException e){

     System.out.println(e.getMessage());

     }

   }

 }