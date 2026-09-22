import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class FileHandling7_AppendData{

public static void main(String[] args) throws IOException{

 FileOutputStream f = new FileOutputStream("test.txt", false);  // true literal is used to enable the append mode
 FileInputStream f1 = new FileInputStream("test.txt");         // false literal is used to off the  append mode and data override the existing file

 String data = "lets Start a java lecture";

 byte[] b = data.getBytes();

  f.write(b);

  System.out.println("Your Data Successfully Append");

  int ch;

  while((ch = f1.read()) != -1)
	{
	   System.out.print((char)ch);
	 
	}

	System.out.println();

  f.close();

 }

}


