package leetCodeDailyQuestions;

public class numberOfSubstrings11032025 {
    public static int numberOfSubstrings(String s) {
        int [] count={0,0,0};
        int left=0,total=0;

        for(int right=0;right<s.length();right++){

            count[s.charAt(right)-'a']++;

            while(count[0]>0 && count[1]>0 && count[2]>0){
                total+=s.length()-right;
                count[s.charAt(left)-'a']--;
                left++;
            }
        }
        return total;

    }

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("aaabc"));

    }
}
