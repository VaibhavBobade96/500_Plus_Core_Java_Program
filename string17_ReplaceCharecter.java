// Replace charecter

public class string17_ReplaceCharecter{

   public static void main(String[] args){

    String name = "Vaibhav";
	String newName = " ";
    
    for(int i = 0; i < name.length(); i++)
    {
       char ch = name.charAt(i);
      
      if(ch == 'a')
      {
         newName = name.replace('a', 'm');
      }

    }


    System.out.println(newName);

 }

}
 