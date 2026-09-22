import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling6_CopyofpasteDataonefiletoAnother{

  public static void main(String[] args) throws IOException{

   FileInputStream f1 = new FileInputStream("test.txt");
   FileOutputStream f2 = new FileOutputStream("Copy.txt");
   FileInputStream f = new FileInputStream("Copy.txt");

   int ch;

  while((ch=f1.read()) != -1)
  {
    f2.write(ch);
  }

  System.out.println("Your Data has SuccessFully... Copied");
  System.out.println("Can You Check.. Plese Wriete yes or no");

  Scanner sc = new Scanner(System.in);
  String str = sc.next();

  if( str.equals("yes"))
 {

  while((ch = f.read()) != -1)
	  {
	    System.out.print((char)ch);
     }

 }else{


 }

  System.out.println();

  f1.close();
  f2.close();

  
  }  
  
}
