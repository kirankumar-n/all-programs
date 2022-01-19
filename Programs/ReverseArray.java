public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        printArray(reverseArray(arr));
    }

    private static void printArray(int[] reverseArray) {
        for (int j = 0; j <= reverseArray.length; j++) {
            System.out.println(reverseArray[j]);
        }
    }

    private static int[] reverseArray(int[] arr) {
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[j - i];
            arr[j - i] = temp;
        }
        return arr;
    }
}
