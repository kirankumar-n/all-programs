import java.util.Arrays;

public class MinSecondInArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(minSecondInArray(arr));
    }

    private static int minSecondInArray(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }
}
