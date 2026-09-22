import java.util.*;

public class BreakAndContinue2{
 
  public static void main(String[] args){

    for(int i=1; i<=20; i++) //4
    {
       if(i % 2 != 0) //2
       {
          continue;

        }

	if( i == 14)
	{
	  break;
	   
	 }

	System.out.println(i);


    }

	
  }

}
