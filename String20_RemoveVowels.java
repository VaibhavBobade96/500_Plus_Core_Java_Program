// Remove Vowels 

public class String20_RemoveVowels{
  
   public static void main(String[] args){

    String name = "vaibhav";

    String result = name.replaceAll("[aeiouAEIOU]","");

    System.out.println("old name :" +name);
    System.out.println("New Name :" +result);

    }

  }