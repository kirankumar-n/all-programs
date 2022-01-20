import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {
        String str = "({}{}([{}]))";
        isBalanced(str);
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char s : str.toCharArray()) {
            if (s == '{' || s == '[' || s == '(') {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char lastOpenedPar = stack.pop();
                if (lastOpenedPar == '{' && s != '}')
                    return false;
                else if (lastOpenedPar == '[' && s != ']')
                    return false;
                else if (lastOpenedPar == '(' && s != ')')
                    return false;
            }
        }
        return stack.size() == 0;
    }
}
