// 27 find longest word

public class Strin27_FindTheLongestWord{

   public static void main(String[] args){

    String name = "my name Maharashtra is";
    String longest = "";
	String word ="";
	

    for(int i = 0; i < name.length()-1; i++)
    {
       if(name.charAt(i) != ' ')    
       {
          word = word + name.charAt(i);   //name
	                          
        }
		else{
			   if(word.length() > longest.length())
			  {
				  longest = word;   // longest = name 
		      }

			  word = "";  // empty
           }
	  
	  } 
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
	  if(word.length() >= longest.length())// 2
			  {
				  longest = word;
		      }
	  System.out.println(longest);
    }

 }
          