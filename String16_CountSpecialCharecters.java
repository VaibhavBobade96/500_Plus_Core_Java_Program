// count special charecters

public class String16_CountSpecialCharecters{

   public static void main(String[] args){

    String name = "Vaib^538*$#@!()><Bobade";

	int count = 0;
    
    for(int i = 1; i < name.length(); i++)
    { 
      char ch = name.charAt(i);
      
       if(!((ch >= '0' && ch <= '9') || (ch <= 'Z' && ch >= 'A') ||  (ch <= 'z' && ch >= 'a') || ch == ' '))
        {
	       count++;
		   System.out.println(ch);
 
	    }
   
     }

	 System.out.println( " Total := "+count);
   
   }

 }