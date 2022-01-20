import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {
        String s1 = "triangle";
        String s2 = "integral";
        System.out.println(isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] s1chars = s1.toCharArray();
        char[] s2chars = s2.toCharArray();
        Arrays.sort(s1chars);
        Arrays.sort(s2chars);
        return Arrays.equals(s1chars, s2chars);
    }
}
