//Skip multiples of 3 and and stops 20 

import java.util.Scanner;

public class BreakAndContinue3{

   public static void main(String[] args){

    for(int i = 1; i <= 50; i++)
     {
        if(i % 3 == 0)
	{
           continue;
	}

	if(i == 20)
	{
	  break;

	}
	  
	  System.out.println(i);
   
     }
    
  }
 
}