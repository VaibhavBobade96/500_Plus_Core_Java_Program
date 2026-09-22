public class String32_FindTheUniqueChar{

    public static void main(String[] args) {

    String name = "vaibhav";
	int count = 0;
	char ch = ' ';
	String result = "";

	for(int i = 0; i < name.length(); i++)
		{
		   ch = name.charAt(i);
		   count = 0;

		  for(int j = 0; j < name.length(); j++)
			{
			    if(name.charAt(i) == name.charAt(j))
				{
					count++;
				}

		    }

			if(count == 1)
			{
				result = result + ch;
            }
		}

		System.out.println(result);

	}

}

				
				