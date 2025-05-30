package Array;

public class maxProduct {
    public static void main(String[] args) {
        int [] nums={3,4,5,2};

        int max = -1;
        int smax = -1;
        for (int num : nums) {
            if (max < num) {
                smax = max;
                max = num;
            } else if (num > smax) {
                smax = num;
            }
        }
        System.out.println((smax-1) * (max-1));
    }
}
