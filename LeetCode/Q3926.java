// Q3926. Count Valid Word Occurrences

// Runtime 80 ms Beats 56.46%
// Memory 127.8 MB Beats 18.09%

import java.util.*;

class Q3926 {
    public int[] countWordOccurrences(String[] chunks, String[] q) {
        StringBuilder sb = new StringBuilder();
        for (String s : chunks)
            sb.append(s);
        int len = sb.length();
        //FIND LIST OF SEPERATORS
        ArrayList<Integer> sep = new ArrayList<Integer>();
        sep.add(-1);
        for (int i = 0; i < len; i++) {
            char ch = sb.charAt(i);
            if(Character.isLowerCase(ch)) continue;
            if(ch == '-'){
                if(i > 0 && i < len -1 && Character.isLowerCase(sb.charAt(i-1)) && Character.isLowerCase(sb.charAt(i+1))) continue;
            }

            sep.add(i);
        } 
        sep.add(len);
        Integer[] s = sep.toArray(new Integer[0]);
        HashMap<String, Integer> m = new HashMap<>();

        for(int i = 0; i< s.length -1;i++) {
            int si = s[i]+1;
            int ei = s[i+1];
            if(si == ei) continue;

            String str = sb.substring(si,ei);
            m.put(str, m.getOrDefault(str, 0) + 1);
        }

        int ans[] = new int[q.length];
        for(int i = 0; i<q.length;i++){
            ans[i] = m.getOrDefault(q[i], 0);
        }
        return ans;
    }
}
