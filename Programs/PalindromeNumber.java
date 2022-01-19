public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 1551;
        if (isPalNum(num)) {
            System.out.println(num + " is Palindrome Number");
        } else {
            System.out.println(num + " is not Palindrome Number");
        }
    }

    private static boolean isPalNum(int num) {
        int copy = num;
        int rev = 0;
        int remainder;
        while (num > 0) {
            remainder = num % 10;
            rev = (rev * 10) + remainder;
            num = num / 10;
        }
        if (copy == rev) return true;
        else return false;
    }
}
