public class Reverse {
    static int reverse(int n, int mul) {
        if(n<10) return n;
        return (n%10) * mul + reverse(n/10, mul/10);
    }

    public static void main(String[] args) {
        System.out.println(reverse(672403200, 100000000));
        System.out.println(reverse(702403002, 100000000));
    }
}
