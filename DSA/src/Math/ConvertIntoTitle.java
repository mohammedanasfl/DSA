package Math;

public class ConvertIntoTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char c=(char)('A'+columnNumber%26);
            sb.append(c);
            columnNumber/=26;
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(2147483647));
    }
}
