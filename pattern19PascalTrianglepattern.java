

public class pattern19PascalTrianglepattern{

   public static void main(String args[]){

 int n = 5;


   for(int row=0; row<n; row++)
   {
	   int num=1;
    for(int space=0; space<n-row; space++)
     {
       System.out.print(" ");
      }
	 
	 for(int col=0; col <= row; col++)
	   {
		 System.out.print(num +" ");
		 num=num*(row-col)/(col+1);

	   }
	     System.out.println();
    }

  }

}

/*

       1-----1
      1 1----3
     1 2 1----5
    1 3 3 1---7
   1 4 6 4 1---9


   ____1
   ___1
   __1
   _1
   1


   */