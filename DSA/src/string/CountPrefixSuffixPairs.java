package string;

public class CountPrefixSuffixPairs {
    public static void main(String[] args) {
        System.out.println(countPrefixSuffixPairs(new String[]{"pa","pada","ma","mama"}));
    }

    private static int  countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(helper(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;

    }

    private static boolean helper(String word, String word1) {
        int n1=word.length(),n2=word1.length();
        if(n1>n2) return false;
        return word1.substring(0,n1).equals(word) && word1.substring(n2-n1).equals(word);
    }
}
