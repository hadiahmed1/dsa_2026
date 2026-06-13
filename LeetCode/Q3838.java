// Q3838. Weighted Word Mapping

// Runtime 2 ms Beats 96.85%
// Memory 46.5 MB Beats 65.52%

import java.util.*;

class Q3838 {
    public static int[] getWeight(String[] words, int[] weights) {
        int[] wts = new int[words.length];
        int index = 0;
        for (String word : words) {
            int wt = 0;
            for (char letter : word.toCharArray()) {
                wt += weights[letter - 'a'];
            }
            wts[index++] = wt % 26;
        }

        return wts;
    }

    public String mapWordWeights(String[] words, int[] weights) {
        int[] wts = getWeight(words, weights);
        StringBuilder sb = new StringBuilder();
        for (int w : wts) {
            sb.append((char) ('a' + 25 - w));
        }

        return sb.toString();
    }
}
