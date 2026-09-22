

public class pattern36HollowPyramid{

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
	   if(col==1 || col==row*2-1 || row==n)
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


*/