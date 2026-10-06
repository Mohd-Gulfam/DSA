package recurssion;

import java.util.*;

public class PowerSetOfStr {

    public void subSet(String ans, String s, int idx, List<String> list) {

        // Base case
        if (idx == s.length()) {
            list.add(ans);
            return;
        }

        char ch = s.charAt(idx);

        // Skip current character
        subSet(ans, s, idx + 1, list);

        // Pick current character
        subSet(ans + ch, s, idx + 1, list);
    }

    public List<String> powerSet(String s) {

        List<String> list = new ArrayList<>();

        subSet("", s, 0, list);

        // Lexicographical order
        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {

        // Object create
        PowerSetOfStr obj = new PowerSetOfStr();

        // Input
        String s = "abc";

        // Method call
        List<String> result = obj.powerSet(s);

        // Print result
        System.out.println("Input: " + s);
        System.out.println("All Subsequences:");

        System.out.println(result);
    }
}