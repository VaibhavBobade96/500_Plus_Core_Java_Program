
public class aaabbccPattern {

    public static void main(String[] args) {

        String name = "aaabbcc";

        for(int i = 0; i < name.length(); i++) // 4
        {
            int count = 0;

            // Check duplicate character
            boolean found = false;

            for(int k = 0; k < i; k++)  //a]0 < 4
            {
                if(name.charAt(i) == name.charAt(k))// 4 == a
                {
                    found = true;
                    break;
                }
            }

            if(found)
            {
                continue;
            }

            // Count character
            for(int j = 0; j < name.length(); j++) // a
            {
                if(name.charAt(i) == name.charAt(j))
                {
                    count++;
                }
            }

            System.out.print(name.charAt(i) + "" + count);
        }
    }
}
