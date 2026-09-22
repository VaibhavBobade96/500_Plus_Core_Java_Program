// Student marks  skip absent students and stop at failed student

public class BreakAndContinue10{

   public static void main(String[] args){
    
    int marks[] = {45, 56, 56, 89, -1, 89, 45};

    for(int i = 0; i < marks.length; i++)
    {
      if(marks[i] == -1)
      {
        continue;
      }

      if(marks[i] < 35)
      {
        break;
      }

    System.out.println("marks :" +marks[i]);

    }

 }


}