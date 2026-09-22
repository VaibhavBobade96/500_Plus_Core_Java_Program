// Skip number 3 and stop when number is 9


import java.util.Scanner;

public class BreakAndContinue6{

   public static void main(String[] args)
   {
      for(int i = 1; i <= 50; i++)
      {
         if(i == 3)
	 {
	   continue;
	 }

	 if(i == 9)
	 {
	    break;
	  }

	  System.out.println(i);
      }
      
 }

}
 