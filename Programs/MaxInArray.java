public class MaxInArray {

    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(maxArray(arr));
    }

    private static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
