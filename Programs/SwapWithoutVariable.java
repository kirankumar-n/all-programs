public class SwapWithoutVariable {

    public static void main(String[] args) {
        int j = 10;
        int i = 6;

        j = j - i; // j = 10 - 6 = 4
        i = i + j; // i = 6 + 4 = 10
        j = i - j; // j = 10 - 4 = 6

        System.out.println(i);
        System.out.println(j);
    }
}
