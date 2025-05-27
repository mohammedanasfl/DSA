package leetCodeDailyQuestions;

public class IsZeroArray20052025 {
    public static void main(String[] args) {
        int [] nums={1,0,1};
        int [][] queries={
                {0,2}
        };

        int[] diff=new int[nums.length+1];

        for(int []i:queries){
            int l=i[0],r=i[1];
            diff[l]-=1;
            if(r+1<nums.length) diff[r+1]+=1;
        }
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += diff[i];
            nums[i] += curr;
        }

        // Step 3: Check if all elements <= 0
        for (int num : nums) {
            if (num > 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
