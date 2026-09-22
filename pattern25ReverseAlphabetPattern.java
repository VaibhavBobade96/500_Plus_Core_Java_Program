
// Reverse alphabet pattern


public class pattern25ReverseAlphabetPattern{

    public static void main(String[] args){

	 char ch = 79;

     for(int row=1; row<=5; row++)
      {
       for(int col=1; col<=row; col++)
       {
        System.out.print(ch+" ");
		ch--;
       }
        
	    System.out.println();
   
    }
  
  }

}

/*

O
N M
L K J
I H G F
E D C B A

*/