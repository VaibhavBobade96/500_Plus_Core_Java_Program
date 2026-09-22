import java.io.File;

public class FileHandling8_DeleteFile{

  public static void main(String[] args){

  File f = new File("test.txt");

  if(f.delete())
  {
    System.out.println("your File is successfully Deleted");

  }
  else{
     
     System.out.println("File Not Found");
   
   }

 }

}