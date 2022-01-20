public class RemoveDupString {

    public static void main(String[] args) {
        String str = "apple";
        System.out.println(removeDuplicate(str));
    }

    private static String removeDuplicate(String str) {
        StringBuilder strNoDup = new StringBuilder();

        for (char s : str.toCharArray()) {
            if (!strNoDup.toString().contains(String.valueOf(s))) {
                strNoDup.append(s);
            }
        }

        return strNoDup.toString();
    }
}
