public class Array13_ArraySort {

    public static void main(String[] args) {

        int[] arr1 = {40, 20, 50, 10, 30};

        int temp;

        for(int i = 0; i < arr1.length; i++)//
        {
            for(int j = 0; j < arr1.length - 1; j++)
            {
                if(arr1[j] > arr1[j + 1])
                {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        for(int k = 0; k < arr1.length; k++)
        {
            System.out.print(arr1[k] + " ");
        }
    }
}