
public class pattern21CharecterTriangle{
 
    public static void main(String[] args){
    
	
    for(int row=1; row<=5; row++)
    {
	  char ch = 65;

      for(int col=1; col<=row; col++)
      {
        System.out.print(ch+" ");
		 ch++;
      }
       
        System.out.println();
     }
        
   }
 
}