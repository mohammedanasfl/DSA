package slidingWindow;

public class NumberOfSubstrings {
    public static void main(String[] args) {
        String s="bbacba";
        System.out.println(numberOfSubstrings(s));

    }

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
}
