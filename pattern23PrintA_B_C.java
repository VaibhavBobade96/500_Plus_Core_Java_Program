

public class pattern23PrintA_B_C{

   public static void main(String[] args){

   for(int row = 1; row<=5; row++)
   {
	 char ch = 65;

    for(int col=1; col<=row; col++)
    {
      System.out.print(ch + " ");
	  ch++;
    }
    
    System.out.println();
  }

}

}

/*


A
A B
A B C
A B C D
A B C D E


*/