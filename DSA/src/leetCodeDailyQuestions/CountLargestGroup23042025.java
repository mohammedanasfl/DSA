package leetCodeDailyQuestions;

public class CountLargestGroup23042025 {
    public static void main(String[] args) {
        System.out.println(countLargestGroup( 13));
    }
    public static int countLargestGroup(int n) {
        int [] freq=new int[36];
        for(int i=1;i<=n;i++) freq[sumDigit(i)]++;

        int count=0,max=0;
        for(int i:freq){
            if(max<i){
                max=i;
                count=1;
            }else if(i==max){
                count++;
            }
        }
        return  count;

    }

    private static int sumDigit(int n) {
        int sum=0;
        while(n !=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

}
