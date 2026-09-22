// 29 remove extra spaces 

public class String29_RemoveExtraSpaces{

  public static void main(String args[]){
  
  String name = "my   name   is   vaibhav   bobade";
  String result = "";
  char space = ' ';
  String newResult ="";
   
  for (int i = 0;i < name.length(); i++)
  {
	   if(name.charAt(i) != ' ')
	   { 
          result = result + name.charAt(i); // my
	   }

	   else{
		      if(name.charAt(i) == ' ')
		     {
               newResult = name.replace("  ", "");
			 }

			   result = " ";

	      }
  }

  System.out.println(newResult);
  
  }

}






















  // vai b bha v