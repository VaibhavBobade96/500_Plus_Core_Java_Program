//. Print numbers, skip odd numbers and stop when number is 16

public class BreakAndContinue5{

  public static void main(String[] args){

    for(int i = 1; i <= 30; i++)
    {
      if(i % 2 != 0)
      {
        continue;
       }
       
       if(i == 16)
       {
          break;

        }

     System.out.println(i);

    }
  
}

}