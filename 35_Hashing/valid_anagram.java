// Valid Anagram 
// Given two strigs s and t, return true if t is an anagram os f, and false  otherwise. an anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exaxtly once. 

// s = "race" t="care"      True
// s = "heart" t="earth"    True 
// s = "tulip" t="lipid"    False 

import java.util.HashMap;

public class valid_anagram {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "race";
        String t = "care";

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                System.out.println("False");
                return;
            }
        }

        if (map.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
