//last  non-repeated character

//vaibhav

public class String34_last{

  public static void main(String[] args){

  String name = "vaibhav";
  int count = 0; 
  char ch = ' ';
   
   for(int i = name.length()-1; i>=0 ; i--)
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
         System.out.println("last non-repeated Charecte :" +ch);
		 break;

       }
	  
	}
    }

 }

       
  