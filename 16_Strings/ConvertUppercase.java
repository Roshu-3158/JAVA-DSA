// for a given string convert each the first letter of each  word to upperacase 
public class ConvertUppercase {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("my name is roshan dattu nikam");

        // Convert the first character to uppercase
        str.setCharAt(0, Character.toUpperCase(str.charAt(0)));

        // Loop through the string and capitalize letters after spaces
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {  // If previous character is a space
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }

        System.out.println(str);
    }
}

