public class find_subsets {

    public static void findSubsets(String str, String ans,  int i) {
        // Base case: if we have considered all characters
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }
        // Include the current character and move to the next
        findSubsets(str, ans + str.charAt(i), i + 1);

        // Exclude the current character and move to the next
        findSubsets(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}