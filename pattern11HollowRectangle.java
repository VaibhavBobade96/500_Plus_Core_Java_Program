
//Hollow rectangle


public class pattern11HollowRectangle{
 
   public static void main(String[] args){

   int n=6;
   int m=5;

   for(int row=1; row<=n; row++)
   {
     for(int col=1;col<=m; col++)
     {
       if(row == 1 || row == n || col == 1 || col == m)
       {
         System.out.print("* ");
       }
       else{
	      System.out.print("  ");
	   }

       }

	   System.out.println();

    }

 }

}
    
















 
/*

*****
*   *
*   *
*   *
*   *
*****

*/

    
