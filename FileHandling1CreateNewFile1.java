import java.io.File;
import java.io.IOException;

public class FileHandling1CreateNewFile1{

  public static void main(String[] args) throws IOException{

  File f = new File("test.txt");// file represent the file and directory

 if(f.createNewFile()) // Create a New file
 { 
   System.out.println("File Created Successfully ");
  }
  else{

    System.out.println("File already Created");
  
  }

 }

}