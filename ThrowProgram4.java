import java.util.*;

class InvalidBalance extends RuntimeException{
  
    InvalidBalance(String message)
    {
       super(message);
    }
    
  }


public class ThrowProgram4{

  public static void main(String[] args){

   int withdraw = 1000;
   int balance = 5000;

   if(withdraw < balance)
   {
      throw new InvalidBalance(" Your Balance is insufficient ");

   }
   
   else {
    
       System.out.println("Withdraw SuccessFully....");

       }

 }

}