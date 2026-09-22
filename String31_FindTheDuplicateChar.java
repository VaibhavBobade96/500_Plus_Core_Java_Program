//Find duplicate characters


public class String31_FindTheDuplicateChar{

   public static void main(String[] args){

    String name = "vaibhav";
    boolean duplicate = false;
	char ch = ' ';

    for(int i = 0; i < name.length(); i++)   //v
    {
	   ch = name.charAt(i);
	   duplicate = false;

       for(int j = 1 + i; j < name.length(); j++) //v
       {
          if(ch == name.charAt(j))
	   {
	       duplicate = true;
		   
	   }

       }
	   if(duplicate == true)
     {
      System.out.println(ch + " is " + "Duplicate");

     }
     }

     
  }

}