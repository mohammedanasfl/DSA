package leetCodeDailyQuestions;

public class CountSymmetricIntegers11042025 {
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1200,1230));

    }
    public static int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
                String temp= String.valueOf(i);
                if(temp.length()% 2==0 && checkSymmetry(temp)){
                    count++;
                }
        }
        return count++;

    }

    private static boolean checkSymmetry(String temp) {
        int n=temp.length()/2;
        int left=0,right=0;
        for(int i=0;i<n;i++){
            left+=temp.charAt(i)-'0';
        }
        for (int i=n;i<temp.length();i++){
            right+=temp.charAt(i)-'0';
        }
        return left == right;
    }
}
