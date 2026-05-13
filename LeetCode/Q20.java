// Q20. Valid Parentheses

// Runtime 3 ms Beats 87.74%
// Memory 42.9 MB Beats 92.30%

import java.util.*;

class Q20 {
    static char closingBrac(char c) {
        return switch (c) {
            case '}' -> '{';
            case ')' -> '(';
            case ']' -> '[';

            case '{', '(', '[' -> 't';

            default -> 'f';
        };
    }

    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            char cl = closingBrac(c);
            if (cl == 'f') continue;
            // opening parenthesis
            else if (cl == 't') list.add(c);
            // closing parenthesis matches
            else if (list.size() > 0 && cl == list.get(list.size() -1) ) {
                list.remove(list.size() - 1);
            } else return false;
        }
        
        return list.size() ==  0;
    }
}
