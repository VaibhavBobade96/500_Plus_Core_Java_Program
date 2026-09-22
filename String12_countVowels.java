// count vowels

public class String12_countVowels{

   public static void main(String[] args){
    
    String str = "Vaibhav";
    int count = 0;
    for(int i = 1; i < str.length(); i++)
    {
       char ch = str.charAt(i);

       if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
       {
           count++;

		   System.out.println(ch + " = "+count);
       }

	   

   }

  
}


}