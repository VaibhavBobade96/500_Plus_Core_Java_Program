// count spaces

public class String15_countSpaces{

   public static void main(String[] args){
    
    String str = "V9 0a ib0 93 ha v";
    int count = 0;
    for(int i = 0; i < str.length(); i++)
    {
       char ch = str.charAt(i);

       if(ch == ' ')
       {
           count++;

	     System.out.println(count+ " = " + "_");
       }

	   

   }

  
}


}