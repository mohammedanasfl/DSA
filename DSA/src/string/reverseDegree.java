package string;

public class reverseDegree {
    public static void main(String[] args) {
        String s="abc";

        int i=1;
        int product=0;
        for(char c:s.toCharArray()){
            int pro=i*('z'-c +1);
            product+=pro;
            i++;
        }
        System.out.println(product);
    }
}
