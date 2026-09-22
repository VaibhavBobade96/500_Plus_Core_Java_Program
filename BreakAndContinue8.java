// Skip multiples of 5 and stop at 25

import java.util.Scanner;

public class BreakAndContinue8{
 
   public static void main(String[] args){       

    for(int i = 1; i <= 100; i++)
    {
      if(i % 5 == 0) 
		{
		  if(i == 25) 
			{ 
			  break;
			}

			continue;
		}

		
	System.out.println(i);

	}


   }

}