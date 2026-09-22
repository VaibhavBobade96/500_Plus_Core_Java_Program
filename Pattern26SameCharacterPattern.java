
// Same character pattern  


public class Pattern26SameCharacterPattern{

   public static void main(String[] args){
    
    char ch = 64;
   for(int row=1; row<=5; row++)
    { 
      ch++;

     for(int col=1; col<=row; col++)
     {
       System.out.print(ch+" ");
     }
       System.out.println();

   }
 
 }

}

/*

A
B B
C C C
D D D D
E E E E E

*/
