//Skip vowels and stop at x;

public class BreakAndContinue7{

  public static void main(String[] args){

     String str = "educationxyz"; //output := dctn

     for(int i = 1; i <= str.length(); i++)
     {
       if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
        {
          continue;
	 }

	 if(str.charAt(i) == 'x')
	 {
	    break;

	 }
       
       System.out.print(str.charAt(i));
      
      }

	  System.out.println();
     
   }

 }

