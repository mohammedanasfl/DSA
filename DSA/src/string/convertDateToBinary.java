package string;

public class convertDateToBinary {
    public static void main(String[] args) {
        String s="2080-02-29";

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(Integer.toBinaryString(Integer.parseInt(s.substring(0,4))));
        stringBuilder.append("-");
        stringBuilder.append(Integer.toBinaryString(Integer.parseInt(s.substring(5,7))));
        stringBuilder.append("-");
        stringBuilder.append(Integer.toBinaryString(Integer.parseInt(s.substring(8))));
        System.out.println(stringBuilder.toString());
    }
}
