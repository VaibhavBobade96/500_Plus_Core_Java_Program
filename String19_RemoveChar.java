// Remove Char

public class String19_RemoveChar{

 public static void main(String[] args){

 /*  String name = "Vaibhav";

   //char removechar = 'a';

  String result = "";

   for(int i = 0; i < name.length(); i++)
   {
      
      if(name.charAt(i) != 'a')
      {  
		  result = result + name.charAt(i);          
      }
    }
   
   System.out.println(result);*/


   String name = "Vaibhav";


   String result = name.replace(String.valueOf('a'), "");

   System.out.println("original String :" +name);
   System.out.println("New String :" +result);


 }

}