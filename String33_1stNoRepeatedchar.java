//First non-repeated character


public class String33_1stNoRepeatedchar{
  
   public static void main(String[] args){

      String name = "vaibhav";
	  int count = 0;
	  char ch = ' ';

      for(int i = 0; i < name.length(); i++)
       {
		  ch = name.charAt(i);
		  count = 0;
         for(int j = 0; j < name.length(); j++)
	 {
	   if(ch == name.charAt(j))
	   {
	       count++;
	   }
	 }

	 if(count == 1)
	 {
       System.out.println("first non-repeeated Charecter :" +ch);
	   break;
	   
	 }

      }
	 

   }

}

