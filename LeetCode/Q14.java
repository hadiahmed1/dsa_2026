// 14. Longest Common Prefix

class Q14 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (i >= s.length() || s.charAt(i) != c)
                    return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }
}