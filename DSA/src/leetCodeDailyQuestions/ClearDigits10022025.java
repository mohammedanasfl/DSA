package leetCodeDailyQuestions;

public class ClearDigits10022025 {
    public static String clearDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                if (i > 0 && !Character.isDigit(sb.charAt(i - 1))) {
                    sb.delete(i - 1, i + 1);
                    i -= 2;
                } else {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(clearDigits("s34"));
    }
}
