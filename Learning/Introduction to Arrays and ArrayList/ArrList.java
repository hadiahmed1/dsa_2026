import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(3);
        arr.add(6);
        arr.add(24);
        arr.add(32);
        arr.add(62);
        arr.add(44);
        arr.add(37);
        arr.add(86);
        arr.add(44);
        System.out.println(arr.toString());
        System.out.println(arr.contains(32));
        arr.remove(5);
        System.out.println(arr.toString());

    }
}