// 23 check palindrome String

public class String23_Checkpallindrome{

    public static void main(String[] args){

     String name = "madam";

     String reverse = "";

     for(int i=name.length()-1; i >= 0; i--)
     {
       reverse = reverse + name.charAt(i);

     }

     if(reverse.equals(name))
     {
        System.out.println(reverse + " = "+" String are palindrome");
     }
    else
    {
        System.out.println("not a palindrome String");
    }

  }

}