// 26 reverse word order

// my name is vaibhav boabade 

public class String26_Reverse_Word_Order{

    public static void main(String[] args){

    String name = " My Name is Vaibhav Bobade";
    String word = "";
    String reverse = "";

    for(int i = name.length()-1; i >= 0; i--)
     {
         char ch = name.charAt(i);

	if(ch != ' ')
	{
	   word = word + ch;
	}
	else {

		  for(int j = word.length()-1; j >= 0; j--)
		  {
	            reverse = reverse + word.charAt(j);  
		  }
		   word = "";
   
 	    }

	 }

	 System.out.println(reverse + " ");
	 

		   System.out.println();


  }

}
	    
  