import java.util.Arrays;

public class MaxSecondInArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(maxSecondInArray(arr));
    }

    private static int maxSecondInArray(int[] arr) {
        Arrays.sort(arr);
        return arr.length-2;
    }
}
