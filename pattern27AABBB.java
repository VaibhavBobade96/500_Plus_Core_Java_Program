
// A A B B B 

public class pattern27AABBB{

  public static void main(String[] args){

	  char ch = 65;

	  for(int row=1; row<2; row++)
	  {
		  System.out.print(ch+" ");
	  }

      ch = 65;
	  for(int col=1; col<=4; col++)
	  {
		System.out.print(ch+" ");
       ch=66;
	  }

	  System.out.println();

    }
}


/*
A A B B B 
*/