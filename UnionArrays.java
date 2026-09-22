class UnionArrays {

    public static void main(String[] args) {

        int arr1[] = {10, 20, 30, 30, 40};
        int arr2[] = {30, 40, 50, 50};

        int result[] = new int[arr1.length + arr2.length];  int result[] = 9;
        int k = 0;

        // arr1 ke elements add karna
        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {

                if (result[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                result[k] = arr1[i];
                k++;
            }
        }

        // arr2 ke elements add karna
        for (int i = 0; i < arr2.length; i++) {

            boolean found = false;

            for (int j = 0; j < k; j++) {

                if (result[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if (found == false) {
                result[k] = arr2[i];
                k++;
            }
        }

        System.out.println("Union:");

        for (int i = 0; i < k; i++) {
            System.out.println(result[i]);
        }
    }
}