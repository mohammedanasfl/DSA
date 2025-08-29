package challenge;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};
        int n=nums.length;
        long actualSum = (n*(n+1))/2;
        long currentSum= Arrays.stream(nums).sum();
        System.out.println((int) (actualSum-currentSum));
    }
}
