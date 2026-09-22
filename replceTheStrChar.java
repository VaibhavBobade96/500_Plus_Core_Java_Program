import java.util.*;
class replceTheStrChar 
{
	public static void main(String[] args) 
	{
	    System.out.println("Please Enter a endex :");

		 Scanner sc = new Scanner(System.in);
		 int index = sc.nextInt();

		 String str1 = "vaibhav";
		 char ch = str1.charAt(index-1);
		   
		   System.out.println(ch);

		 System.out.println(str1.charAt(index-1));

	}
}
