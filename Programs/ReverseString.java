public class ReverseString {

    public static void main(String[] args) {
        String str = "apple";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }
}

// Time Complexity: O(n)
// Using StringBuilder will be more efficient than String
// String is immutable and concatenation in the loop will create many String objects