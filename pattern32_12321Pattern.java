
//12321 Pattern

public class pattern32_12321Pattern{

     public static void main(String[] args){

     for(int row=1; row<=4; row++)
      {
       for(int col=1; col<=5;col++)
       {
          if(col <= 3)
	     {
	       System.out.print(col+" ");
	     }
	  else{
		   if(col % 2 == 0)
		    {
			 System.out.print("2"+" ");
	        }
		 else{
			 System.out.print("1"+" ");
		    }
       }

	   }
       System.out.println();

     }
   }

}



/*

12321
12321
12321
12321


*/