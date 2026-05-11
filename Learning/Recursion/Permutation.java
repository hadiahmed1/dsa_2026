import java.util.ArrayList;

public class Permutation {
    private static ArrayList<StringBuilder> permutation(StringBuilder sb){
        ArrayList<StringBuilder> result = new ArrayList<>();
        if(sb.length() == 1) {
            result.add(sb);
            return result;
        }

        for(int i = 0; i<sb.length();i++){
            StringBuilder cp = new StringBuilder(sb);
            cp.deleteCharAt(i);
            ArrayList<StringBuilder> perm = permutation(cp);
            for (StringBuilder p: perm) {
                p.insert(0, sb.charAt(i));
            }
            result.addAll(perm);
        }

        return result;
    }
    public static void main(String[] args) {
        for (StringBuilder sb : permutation(new StringBuilder("abc"))) {
            System.out.print(sb.toString()+" ");
        }
        
    }
}
