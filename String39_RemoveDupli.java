// Remove duplicate characters

public class String39_RemoveDupli{

   public static void main(String[] args){

    String name1 = "programming";
    String result = "";

    for(int i = 0; i < name1.length(); i++)
    {
      char ch = name1.charAt(i);  // prog

      if(result.indexOf(ch) == -1)  // pr0g == -1(not found)
       {
          result = result + ch;
       }

     }

     System.out.println(result);

   }

}