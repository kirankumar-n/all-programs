import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static void main(String[] args) {
        String str = "apple";
        countLetters(str);
    }

    private static void countLetters(String s) {
        Map<Character, Integer> countChar = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (countChar.containsKey(c)) {
                countChar.put(c, countChar.get(c) + 1);
            } else {
                countChar.put(c, 1);
            }
        }
        System.out.println(countChar);
    }
}
