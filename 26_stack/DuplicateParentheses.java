import java.util.*;

public class DuplicateParentheses {

    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ')') {
                stack.push(ch);
            } else {
                int count = 0;

                // Pop until '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                // Pop the opening '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }

                // If count < 1, it means () or (a) or similar → Duplicate
                if (count <= 1) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String expr1 = "((a+b))";
        String expr2 = "(a+(b)/c)";
        String expr3 = "(a)";

        System.out.println(hasDuplicateParentheses(expr1)); // true
        System.out.println(hasDuplicateParentheses(expr2)); // false
        System.out.println(hasDuplicateParentheses(expr3)); // true
    }
}
