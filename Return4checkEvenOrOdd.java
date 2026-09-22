import java.util.*;

public class Return4checkEvenOrOdd{

   static String CheckEvenOrOdd(int num)
   {

     if(num % 2 == 0)
     {
       return "even";

     }

     else {

       return "odd";
     }

  }

  public static void main(String[] args){

   String result =  CheckEvenOrOdd(10);

    System.out.println("Print the result :" +result);

    }

 }

