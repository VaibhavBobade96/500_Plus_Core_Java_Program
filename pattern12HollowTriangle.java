// Hollow Traianle 

public class pattern12HollowTriangle{

  public static void main(String[] args){

	  int num5 = 5;


	  //row 
	   for(int row = 1; row <= num5; row++)//5
	  {
		  //space
		 for(int space = 1; space <= num5 - row; space++)
		  {
			System.out.print("_");
		  }

    	 //col
		 for(int col = 1; col <= 2*row-1; col++)
		  {
			 if(col==1 || row == num5 || col == 2*row-1)

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
____*
___*_*
__*___*
_*_____*
*********


  */