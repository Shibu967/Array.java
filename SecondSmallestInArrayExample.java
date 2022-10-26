public class SecondSmallestInArrayExample {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 10, 8 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
                System.out.println();
            }
            // System.out.println("print sort array decending order");
            // for (i = 0; i < arr.length; i++) {

        }
        System.out.print(arr[1]);

    }

}
