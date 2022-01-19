public class MinInArray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 12;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(minArray(arr));
    }

    private static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
