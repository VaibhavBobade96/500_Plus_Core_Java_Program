

public class pattern18FloydsTrianglepattern{

   public static void main(String args[]){
  
    int count = 1;
   for (int row=1; row <= 5; row++)
   {
	 for(int col=1; col<=row; col++)
	   {
		 if(count<=15)
		   {
		    System.out.print(count+ " ");
			count++;

		   }
		  
	   }

	   System.out.println();

	   
     }

   }

}


/*

1 
2  3 
4  5  6
7  8  9  10
11  12  13  14  15

*/