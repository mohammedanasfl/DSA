package string;

public class MaximumValue {
    public static void main(String[] args) {
        String[] strs={"alic3","bob","3","4","00000"};

        int max=Integer.MIN_VALUE;
        boolean hasDigit = false;
        boolean hasLetter = false;
        int length=0;
        for(String str:strs){
            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) hasDigit = true;
                if (Character.isLetter(c)) hasLetter = true;
            }
            if (hasDigit && hasLetter) {
                length = str.length();
            } else if (hasDigit) {
                length = Integer.parseInt(str);
            } else {
                length = str.length();

            }
            max=Math.max(max,length);
        }
        System.out.println(max);

    }
}
