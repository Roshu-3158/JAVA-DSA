public class find_permutations {
    public static void findPermutations(String str, String ans) {
        // Base case: if we have considered all characters
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char curr =  str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i + 1); // Remove the current character
            findPermutations(Newstr, ans + curr); // Recur with the remaining characters
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
