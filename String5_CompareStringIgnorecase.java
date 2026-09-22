//Compare ignoring case


public class String5_CompareStringIgnorecase{
 
   public static void main(String[] args){

    String name1 = "Vaibhav";
    String name2 = "vaibhav";
    boolean newStr = name1.equalsIgnoreCase(name2);
    System.out.println(newStr);

	if(newStr == true)
	   {
		  System.out.println("Both Strings are equals");
	   }
     else{
		  System.out.println("Both Strings are not  equals");
	 }

    }


 }