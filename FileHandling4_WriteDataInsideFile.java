import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling4_WriteDataInsideFile{

  public static void main(String[] args) throws IOException {// throws is used to declared the exception
	  // may be occured the IOException

   String name = " Good Morning ! Student "; // Store data in name variable String format

   FileOutputStream f = new FileOutputStream("test.txt"); // Output Stream Class provide the java for write the data inside the file 
     // new is a fileOutputstream class object text.txt file provide 

    byte[] b = name.getBytes();// convert the name String data into byte array

   f.write(b); // file reference and wriete is method is used to write the data inside the file using references

   System.out.println("Data inserted");
   
   }

 }


