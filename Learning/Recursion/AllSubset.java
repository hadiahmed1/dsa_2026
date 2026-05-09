import java.util.ArrayList;

public class AllSubset {
    static ArrayList<String> subset(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list;
            list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> l1 = subset(p + ch, up.substring(1));
        ArrayList<String> l2 = subset(p, up.substring(1));
        l1.addAll(l2);
        return l1;
    }

    public static void main(String[] args) {
        System.out.println(subset("", "abc").toString());
    }
}
