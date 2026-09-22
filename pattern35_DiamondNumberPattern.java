

public class pattern35_DiamondNumberPattern{
 
    public static void main(String[] args){
 
     // row
     for(int row=1; row<=5; row++)
     { 
      //spaces
      for(int space=4; space >= row; space--)
      {
        System.out.print("_");
      }

	   //col
      for(int col=1; col<=row; col++)
       {
        System.out.print(col);
       }

     
      System.out.println();
    }

  }

}

/*

    1
   123
  12345
 1234567
123456789
 1234567
  12345
   123
    1
*/

/*

____1
___1
__1
_1
1


*/