package leetCodeDailyQuestions;

public class DifferenceOfSums27052025 {
    public static void main(String[] args) {
        int n=10;
        int m=3;

        int sum=0,nonDivSum=0;
        for(int i=1;i<=n;i++){
            if(i% m == 0) nonDivSum+=i;
            else sum+=i;
        }
        System.out.println(sum-nonDivSum);
    }
}
