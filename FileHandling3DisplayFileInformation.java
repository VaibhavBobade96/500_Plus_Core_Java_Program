import java.io.File;

public class FileHandling3DisplayFileInformation{

  public static void main(String arg[]){

   File f = new File("test.txt");

   System.out.println("File name : " +f.getName()); // get the file name 
   System.out.println("File path :" +f.getPath());  // get the file path
   System.out.println("Absolute Path :" +f.getAbsolutePath()); //get the absolute path means total path
   System.out.println("Print Length :" +f.length() + " Byte"); // get the charecter length

   }

 }