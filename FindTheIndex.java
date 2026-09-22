import java.util.Scanner;
public class FindTheIndex{

   public static void main(String[] args){
   
   Scanner sc = new Scanner(System.in);
     String name = "Vaibhav";

     System.out.println("Please Enter a Index :");
     int index = sc.nextInt();

     char ch = name.charAt(index-1);

     System.out.println(ch);

     }

 }

