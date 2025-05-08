package slidingWindow;

public class CharacterReplacement {
    public static void main(String[] args) {

        String a="AAABBCCD";
        int k=2;

        int left=0,right=0,maxLength=0,maxFreq=0;

        int [] freq=new int[26];
        while(right< a.length()){
            char c=a.charAt(right);
            freq[c-'A']++;
            maxFreq=Math.max(maxFreq,freq[c-'A']);

            while ((right-left+1)-maxFreq>k){
                freq[a.charAt(left)-'A']--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        System.out.println(maxLength);
    }
}
