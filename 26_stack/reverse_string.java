
// question : Push at the Bottom of the stack 
import java.util.Stack;

public class reverse_string {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        String str = "HellowWorld";
        String reverse = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            s.push(ch);
        }

        while (!s.isEmpty()) {
            reverse += (s.pop());
        }

        System.out.println(reverse);
    }
}
