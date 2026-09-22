import java.io.File;

public class FileHandling2CheckFile{

  public static void main(String[] args){

  File f = new File("test.txt");

  if(f.exists())
  {
    System.out.println("File Already EXist");
   }

   else {

     System.out.println("Not File Found");

    }

  }

}