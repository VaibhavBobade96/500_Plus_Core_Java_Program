import java.util.*;

public class ReturnLargestNumber{

  static int CheckLargest(){
     
	 int a = 10, b = 20;

     if(a > b)
     {
       return a;
      }
     else {
         return b;

	}

   }

  public static void main(String[] args){

     int result = CheckLargest();

     System.out.println("The largest Number is : "+ result);

     }

  }


