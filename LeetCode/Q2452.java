// 2452. Words Within Two Edits of Dictionary

// You are given two string arrays, queries and dictionary. All words in each array comprise of lowercase English letters and have the same length.
// In one edit you can take a word from queries, and change any letter in it to any other letter. Find all words from queries that, after a maximum of two edits, equal some word from dictionary.
// Return a list of all words from queries, that match with some word from dictionary after a maximum of two edits. Return the words in the same order they appear in queries.

// Runtime 2 ms Beats 97.79%
// Memory 44.37 MB Beats 71.32%

import java.util.*;

class Q2452 {
    private static int diff(String s1, String s2) {
        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                diff++;
            if (diff > 2) // no need to chec further as limit alreadu exceeded
                return 3;
        }
        return diff;
    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> l = new ArrayList<String>();
        for (String q : queries) {
            for (String d : dictionary) {
                if (diff(q, d) <= 2) {
                    l.add(q);
                    break; // match found
                }
            }
        }

        return l;
    }
}