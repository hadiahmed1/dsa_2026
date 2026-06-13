// Q17. Letter Combinations of a Phone Number

// Runtime 4 ms Beats 5.96%
// Memory 49.2 MB Beats 10.81%

import java.util.*;

class Q17 {
    public static String getLetters(char c) {
        switch (c) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
        }

        return "";
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 1) {
            String letters = getLetters(digits.charAt(0));

            List<String> result = new ArrayList<>();

            for (char c : letters.toCharArray()) {
                result.add(String.valueOf(c));
            }

            return result;
        }
        // get letter combinations for 1-> last
        List<String> combi = letterCombinations(digits.substring(1));
        // append all current letters to combination
        ArrayList<String> all = new ArrayList<String>();
        for (String sub : combi) {
            String letters = getLetters(digits.charAt(0));
            for (int i = 0; i < letters.length(); i++) {
                all.add(letters.charAt(i) + sub);
            }
        }
        return all;
    }
}
