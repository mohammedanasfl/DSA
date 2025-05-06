package slidingWindow;

public class MostConsectiveOnes {
    public static void main(String[] args) {

        int [] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int right=0,left=0,maxLength=0,zeroCount=0;

        while(right<arr.length){
            if(arr[right] == 0) zeroCount++;

            while(zeroCount>k){
                if(arr[left] == 0) zeroCount--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        System.out.println(maxLength);
    }
}
