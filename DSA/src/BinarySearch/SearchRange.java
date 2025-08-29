package BinarySearch;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result={-1,-1};
        result[0]=binarySearch(nums,target,true);
        result[1]=binarySearch(nums,target,false);
        System.out.println(result[0] + ", " + result[1]); // expected: 3, 4
    }

    private static int binarySearch(int[] nums, int target, boolean isFirst) {
        int left=0,right =nums.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(target < nums[mid]) right=mid-1;
            else if(target >nums[mid]) left=mid+1;
            else{
                ans=mid;
                if(isFirst){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
        }
        return ans;
    }


}
