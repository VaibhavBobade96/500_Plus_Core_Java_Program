import java.util.Scanner;

class PanlindromeCheckProgram{

 public static void main(String[] args){
 
 System.out.println("please Enter a number :");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  
  int original = num;
  int reverse = 0;

  while(num != 0)
  {
    int digit = num % 10;
    reverse = reverse * 10 + digit;
    num = num / 10;

  }

  System.out.println("Original number :" +original);
  System.out.println("Reverse Number :" +reverse);

  if(original == reverse)
  {
    System.out.println(reverse + " is palindrome number");
   }
   
  else{
     System.out.println(reverse + " Not a palindrome number");
  }

}

}

  
