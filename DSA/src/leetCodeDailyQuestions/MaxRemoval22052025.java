package leetCodeDailyQuestions;

public class MaxRemoval22052025 {
    public static void main(String[] args) {

        int [] nums={2,0,2};

        int [][]queries={
                {0,2},
                {0,2},
                {1,1}
        };
        int count=0;
        for(int []i:queries){
            for(int j=i[0];j<=i[1];j++){
                nums[j]-=1;
            }
            count++;
            if(allAreZero(nums)){
                break;
            }
        }
        System.out.println(count);
    }

    private static boolean allAreZero(int[] nums) {
        for (int num : nums) {
            if (num > 0) {
                return false;
            }
        }
        return true;
    }
}
