//25 reverse each word


public class String25_reverseEachWord{
 
    public static void main(String[] args){

     String name = "my name is vaibhav bobade ra mategaon";

     String reverse = "";
	 String word = "";

     for(int i= 0; i < name.length()-1; i++)
     {
		char ch = name.charAt(i);   // ch = my

       if(ch != ' ')
		 {
		    word = word + ch; //my
		 }

		else{
             
			 for(int j= word.length()-1 ; j >= 0; j--)
			{ 
			  
				reverse = reverse +  word.charAt(j); // ym
			}

			reverse = reverse + ' ';  // ym_
			word = "";   // 

		}

     }

      for(int j= word.length()-1 ; j >= 0; j--)
			{ 
			  
				reverse = reverse +  word.charAt(j);
			}

			System.out.println(reverse);

   }
 
 }