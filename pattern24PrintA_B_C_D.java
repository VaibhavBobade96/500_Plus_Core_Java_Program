

//A-B-C-D pattern


public class pattern24PrintA_B_C_D{

   public static void main(String[] args){

   char ch = 65;

   for(int row = 1; row<=5; row++)
   {

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
B C
D E F
G H I J
K L M N O


*/

