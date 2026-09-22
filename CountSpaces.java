import java.util.Scanner;

public class CountSpaces{
 
 public static void main(String[] args){

  String name = "V a i b h a b "; // 7

 int count = 0;

   for(int i = 0; i < name.length(); i++)
   {
  
	 if(name.charAt(i) == ' ')
	 {
		 count++;
	 }
   }

   System.out.println("Spaces : " +count);

 }

}
     
