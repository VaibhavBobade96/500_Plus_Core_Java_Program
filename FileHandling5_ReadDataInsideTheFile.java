import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling5_ReadDataInsideTheFile{

  public static void main(String[] args) throws IOException{

   FileInputStream f = new FileInputStream("test.txt");

   int ch;

   while((ch=f.read()) != -1)
   {
     System.out.print((char)ch);

   }

   System.out.println();

   f.close();
  
  }

}