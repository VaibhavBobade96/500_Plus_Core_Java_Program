// count charecters 

public class String11_CountCharecters{

    public static void main(String[] args){

   String name = "vaibhav";

   int count = 1;

   for(int i=1; i < name.length(); i++)
   {
      char str = name.charAt(i);
      count++;
   }

   System.out.println(count);

 }

}
     