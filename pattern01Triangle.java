
// 0 1 Triangle print

public class pattern01Triangle{

   public static void main(String[] args){

   for(int row=1; row<=5; row++)
   {
     for(int col=1; col<=row; col++)
     {
		 if((col+row)%2 == 0)
	     {
           System.out.print("0"+" ");
		 }
		 else{
           System.out.print("1"+" ");
		 }
     }
       
       System.out.println();
   }

 }

}


/*






*/

