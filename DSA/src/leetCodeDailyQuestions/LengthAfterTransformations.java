package leetCodeDailyQuestions;

public class LengthAfterTransformations {
    public static void main(String[] args) {
        String s="abcyy";
        int t=2;
        int MOD=1_000_000_007;
        int [] arr=new int[26];
        for(char c:s.toCharArray()){
            arr[(c-'a')]++;
        }
        for (int i=0;i<t;i++){
            int [] next=new int[26];
            for(int j=0;j<26;j++){
               if(arr[j]==0) continue;
               if(j==25){
                   next[0]=(next[0]+arr[j])%MOD;
                   next[1]=(next[1]+arr[j])%MOD;
               }
               else{
                   next[j+1]=(next[j+1]+arr[j])%MOD;
               }
            }
            arr=next;
        }
        int count=0;
        for(int i:arr){
            count=(i+count)% MOD;
        }
        System.out.println(count);
    }
}
