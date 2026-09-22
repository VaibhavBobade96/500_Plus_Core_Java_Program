//Count occurrence of word


public class String37_CountOccuranceOfWord{

   public static void main(String[] args){

    String str1 = "java is eassy and java is powerful";
    String str2 = "java";
	int count = 0;

    String[] words = str1.split(" ");

   for(int i = 0; i < words.length; i++)
   {
     if(words[i].equals("java"))
     {
       count++;
     }

	
   }

    System.out.println("Occurence of Word "+ str2 +" = "+ count);


  }
}
     
