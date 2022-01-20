/**
 * Write a method that accepts int[] array and an int number, find 2 elements in the array that sum is equal to the given int.
 */
public class SumArray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(sum(arr, 7));
    }

    private static String sum(int[] arr, int num) {
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        return "Numbers is " + num1 + " and " + num2;
    }
}
