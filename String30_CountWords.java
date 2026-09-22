////30 count words 


public class String30_CountWords{
  
    public static void main(String[] args){

	int count = 1;

     String name = "My name is Vaibhav Bobade Ra mategaon";

     for(int i = 1; i <= name.length()-1; i++)
     {
        if(name.charAt(i) == ' ')
	{
	  count++;
	}
     }

     System.out.println(count);
  }

}
