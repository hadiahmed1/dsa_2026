// 58. Length of Last Word

// Runtime 0 ms Beats 100.00% 
// Memory 42.92 MB Beats 69.62% 

public class Q58 {
    public int lengthOfLastWord(String s) {
        int li = s.length()-1;
        while(s.charAt(li) == ' ' && li>0) li--;
        int si = li;
        while(si>= 0 && s.charAt(si)!=' ') si--;

        return li - si;
    }
}
