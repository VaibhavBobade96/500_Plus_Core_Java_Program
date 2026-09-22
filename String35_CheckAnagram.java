// Check anagram
import java.util.Arrays;

public class String35_CheckAnagram{

  public static void main(String[] args){

   String name1 = "listen";
   String name2 = "silent";

   char[] ch1 = name1.toLowerCase().toCharArray();
   char[] ch2 = name2.toLowerCase().toCharArray();

   Arrays.sort(ch1);
   Arrays.sort(ch2);

   if(Arrays.equals(ch1,ch2))
   {
     System.out.println("Arrays Are Anagram");
   }
   else{
      System.out.println("Arrays Are not Anagram");
      }
    }

 }