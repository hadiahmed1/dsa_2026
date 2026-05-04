public class RemoveA {
    public static String removeA(String s) {
        if(s.length() == 1) {
            if(s.charAt(0)=='a') return "";
            return "a";
        }

        if(s.charAt(0) == 'a') return removeA(s.substring(1));
        return s.charAt(0) + removeA(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(removeA("my name is hadi ahmed. I'm in class a"));
    }
}
