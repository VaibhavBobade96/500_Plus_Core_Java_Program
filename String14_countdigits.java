// count digits

public class String14_countdigits{

   public static void main(String[] args){
    
    String str = "V90aib093hav";
    int count = 0;
    for(int i = 0; i < str.length(); i++)
    {
       char ch = str.charAt(i);

       if(ch >= '0' && ch <= '9')
       {
           count++;

	     System.out.println(count+ " = " +ch);
       }

	   

   }

  
}


}