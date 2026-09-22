import java.util.Scanner;

public class strMethod_8{

  public static void main(String[] args){

    String str = "Vaibhav";

    int check1 = str.codePointCount(1, 4);

    System.out.println("code Point Count Result :" +check1);

    int check2 = str.offsetByCodePoints(1, 3);

    System.out.println("Code pointByoffset result :"+check2);

    }

 }
