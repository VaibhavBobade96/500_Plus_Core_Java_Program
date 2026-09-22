import java.util.Scanner;

 class mainString{

  static void String_Method()
  {
     String name = " P o o j a ";
     String New_Name = name.replaceAll(" ", "");
     System.out.println("Remove the digit in this string :" +New_Name); 


     String Surname = "Shinde123";
     String New_Surname = Surname.replaceAll("[0-9]", "");

     System.out.println("Remove the digit in this string :" +New_Surname); 

  }

  static void StringMethod1()
  {

     String str = " Vaibhav";

     char ch[] = str.toCharArray();

     for(int i = ch.length - 1 ; i >= 0; i--)
     {
        System.out.print(ch[i]);
     }

	 System.out.println();
  
 }


  static void PrintIndex()
	 {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Please Enter a String :" );
	   String str = sc.next();

	   System.out.println("please enter the charecter :" );
	   char ch = sc.next().charAt(0);


	   System.out.println("Find The index of String charecter :" +str.indexOf(ch));
	 }

   static void ReverseString()
	 {
	    String str = "pune";

		for (int i = str.length()-1; i >= 0; i--)
		{
			 System.out.print(str.charAt(i));
		}

		System.out.println();
	 
	 }
	 


}


 public class main1{

  public static void main(String[] args){

   mainString m1 = new mainString();
   m1.String_Method();

   m1.StringMethod1();

   m1.PrintIndex();
   m1.ReverseString();

   }


}


 
      