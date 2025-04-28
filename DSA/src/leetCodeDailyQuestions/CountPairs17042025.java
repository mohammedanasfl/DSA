package leetCodeDailyQuestions;

public class CountPairs17042025 {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1,2,3,4},1));
    }

    private static int  countPairs(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && ((i*j)%k)==0){
                    count++;
                }
            }
        }
        return count;
    }
}
