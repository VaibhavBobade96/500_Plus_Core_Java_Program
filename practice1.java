// practice 

public class practice1{

 public static void main(String[] args){

  for(int row = 1; row <=5 ; row++) //1
  {
    for(int s = 4; s >= row;  s--)
    {
		System.out.print(" ");
    }
	 for(int col = 1 ; col <= row * 2 - 1 ; col++)
	  {
		 if( col == row * 2 - 1 || col == 1 || row == 5)
		  {
			 System.out.print("*");
		  }
		  else{
			  System.out.print(" ");
		  }
	  
	  }

	System.out.println();

   }

   for(int row = 1; row <=5 ; row++) //1
  {
    for(int s = 4; s >= row;  s--)
    {
		System.out.print(" ");
    }
	 for(int col = 1 ; col <= row * 2 - 1 ; col++)
	  {
		 if( col == row * 2 - 1 || col == 1 || row == 5)
		  {
			 System.out.print("*");
		  }
		  else{
			  System.out.print(" ");
		  }
	  
	  }

	System.out.println();

   }
 }
}



/*
    *
   * *
  *   *
 *     *
*********


r * 2 -1

____*
___* *
__*   *
_*     * 
*********




*/









  /*

 ____* 
 ___* *
 __** *
 _****
 *****

 */