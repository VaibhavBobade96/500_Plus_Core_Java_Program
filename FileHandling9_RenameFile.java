import java.io.File;

public class FileHandling9_RenameFile{

  public static void main(String[] args){

   File f = new File("Copy.txt");// old file object 
   File f1 = new File("Test.txt");// new file object 

   if(f.renameTo(f1)) // oldfile reference. renameTo(newfile reference)
   {
     System.out.println("your File name Change Successfully..");
   }
   else{

     System.out.println("File not found");
    
    }
 
 }

}