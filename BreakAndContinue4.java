// print the charecter ski e and stop at n

public class BreakAndContinue4{

 public static void main(String[] args){

  String name = "abcdefghijklmnop";

  for(int i = 0; i < name.length(); i++) 
  {
    
	if(name.charAt(i) == 'e')
	  {
		continue;
	  }

	 if (name.charAt(i) == 'n')
	 { 
		 break;
	 }
   
     System.out.print(name.charAt(i));///abcd
	 
   }

   System.out.println();

  }

}