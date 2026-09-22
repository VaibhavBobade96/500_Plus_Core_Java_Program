

// Palindrome Number Pattern


public class Pattern34PalindromeNumber{

   public static void main(String[] args){

   for(int row=1; row<=5; row++)//4
    {

	 //increasing numbers
     for(int col=1; col<=row; col++) //
     {
        System.out.print(col + " ");
     }

     //Decreasing numbers
     for(int col=row-1; col>=1; col--)//col = 3 
     {
        System.out.print(col + " ");
     }


      System.out.println();
	}
  }

}
    



/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2  3 4 5 4 3 2 1

*/