public class remove_duplicate_string {
    public static String removeDuplicates(String str) {
        // Base case: if the string is empty or has only one character, return it
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case: check the first character and remove duplicates
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);

        // Remove all occurrences of the first character from the rest of the string
        String restWithoutFirstChar = restOfString.replace(String.valueOf(firstChar), "");

        // Combine the first character with the processed rest of the string
        return firstChar + removeDuplicates(restWithoutFirstChar);
    }
    public static void main(String[] args) {
        String str = "aabbccddeeffgghh";
        String result = removeDuplicates(str);
        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + result);
    }
}
