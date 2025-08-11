package slidingWindow;

public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        int maxVowels = maxVowels(s, k);
        System.out.println(maxVowels);
    }

    private static int maxVowelsBruteForce(String s, int k) {
        int maxCount = 0;
        for(int i=0;i<=s.length()-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if("aeiou".indexOf(s.charAt(j)) != -1){
                    count++;
                }
            }
            maxCount=Math.max(maxCount,count);
        }

        return maxCount;
    }

    private static int maxVowels(String s, int k) {
       int maxCount=0;
       int currentCount=0;
       for(int i=0;i<k;i++){
           if("aeiou".indexOf(s.charAt(i))!=-1) currentCount++;
       }
       maxCount=currentCount;

       for(int i=k;i<s.length();i++){
           if("aeiou".indexOf(s.charAt(i-k))!=-1) currentCount--;
           if("aeiou".indexOf(s.charAt(i))!=-1) currentCount++;
           maxCount=Math.max(maxCount,currentCount);
       }
        return maxCount;
    }
}
