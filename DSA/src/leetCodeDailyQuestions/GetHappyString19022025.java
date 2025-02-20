package leetCodeDailyQuestions;

public class GetHappyString19022025 {
    static  int count=0;
    static String result="";
    public static String getHappyString(int n, int k) {
        char [] c={'a','b','c'};
        generateHappyString(n,new StringBuilder(),c,k);
        return result;
    }

    private static void generateHappyString(int n, StringBuilder current, char[] c, int k) {
        if (current.length() == n) {
            count++;
            if (count == k) {
                result = current.toString();
            }
            return;
        }
        for(char a:c){
            if(current.length() ==0 || current.charAt(current.length()-1)!=a){
                current.append(a);
                System.out.println(current+"  "+a);
                generateHappyString(n,current,c,k);
                current.deleteCharAt(current.length()-1);
                if (!result.isEmpty()) return;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getHappyString(3,9));
    }
}
