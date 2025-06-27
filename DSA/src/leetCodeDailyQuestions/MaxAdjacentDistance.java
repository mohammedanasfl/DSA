package leetCodeDailyQuestions;

public class MaxAdjacentDistance {
    public static void main(String[] args) {
        int [] arr={1,2,4};
        int diff=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            diff=Math.max(diff,Math.abs(arr[i]-arr[(i+1)%arr.length]));
        }
        System.out.println(diff);
    }
}
