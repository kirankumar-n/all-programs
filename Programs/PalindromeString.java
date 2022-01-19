public class PalindromeString {

    public static void main(String[] args) {
        String str = "civic";
        if (isPal(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }

    private static boolean isPal(String str) {
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(j - i))
                return false;
        }
        return true;
    }
}
