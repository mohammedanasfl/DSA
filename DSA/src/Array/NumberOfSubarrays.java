package Array;

public class NumberOfSubarrays {


    public static void main(String[] args) {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(countAtMost(nums, k) - countAtMost(nums, k - 1)); // expected: 2
    }

    private static int countNiceSubarrays(int[] nums, int k) {
        int maxLen=0;

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j] %2 !=0){
                    count++;
                }
                if(count==k) maxLen++;
                if(count>k) break;
            }
        }
        return maxLen;

    }

    // optimised approach
    private static int countAtMost(int[] nums, int k) {
        int left = 0, right = 0, countOdd = 0, res = 0;

        while (right < nums.length) {
            if (nums[right] % 2 != 0) countOdd++;

            while (countOdd > k) {
                if (nums[left] % 2 != 0) countOdd--;
                left++;
            }
            res += (right - left + 1);
            right++;

        }
        return res;
    }

}
