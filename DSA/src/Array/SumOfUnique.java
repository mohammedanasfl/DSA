package Array;

public class SumOfUnique {
    public static void main(String[] args) {

        System.out.println(sumOfUnique(new int[]{1,2,3,4,5}));
    }
    public static int sumOfUnique(int[] nums) {
        int [] freq=new int[101];

        for(int i:nums){
            freq[i]++;
        }
        int sum=0;
        for(int i=1;i<freq.length;i++){
            if(freq[i] == 1){
                sum+=i;
            }
        }
        return sum;

    }
}
