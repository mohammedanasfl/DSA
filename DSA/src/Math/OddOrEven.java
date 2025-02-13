package Math;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(22));
    }

    private static boolean oddOrEven(int num) {
        return ((num & 1) == 1);
    }
}
