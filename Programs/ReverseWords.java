public class ReverseWords {

    public static void main(String[] args) {
        String str = "apple banana kiwi";
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String str) {
        StringBuilder revWords = new StringBuilder();
        String[] strings = str.split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            revWords.append(strings[i]).append(" ");
        }
        return revWords.toString();
    }
}
