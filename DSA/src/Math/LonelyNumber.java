package Math;

public class LonelyNumber {
    public static void main(String[] args) {
        int []arr={12,23,45,6,45,23,12};
        int lonelyNum=0;
        for(int i:arr){
            lonelyNum^=i;
        }
        System.out.println(lonelyNum);
    }
}
