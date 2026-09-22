

public class pattern37HollowDiamond{
 
    public static void main(String[] args){
     
 int n=5;
   // row
   for(int row=1; row<=n; row++)
   {
    // Space
     for(int space=4; space>=row; space--)
     {
       System.out.print(" ");
     }

	 //col
	 for(int col=1; col<=row*2-1; col++)
	  {
	   if(col==1 || col==row*2-1)
		  {
           System.out.print("*");
	      }

		else{
			System.out.print(" ");
		}

	  }
	  System.out.println();
	   
   }


  
   // row
   for(int row=n-1; row>=1; row--)//4
   {
    // Space
     for(int space=1; space<=row; space++)
     {
       System.out.print("_");
     }

	// col

	 for(int col=1; col<=row*2-1; col++)
	   {
		 if(col==1 ||col == row*2-1)
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
*       *
 *     *7
  *   *5
   * *3

*/