package leetCodeDailyQuestions;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int [] arr={1,2,34,3,4,5,7,23,12};
        int count=0;

        for(int i:arr){
            if(i%2 !=0) count++;
            else{
                count=0;
            }
            if(count>=3){
                break;
            }
        }
        System.out.println(count >= 3);
    }
}
