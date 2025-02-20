package recursion;

public class NumberOfSteps {
    static int count=0;
    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {

        if(num==0) return count;
        count++;
        if(num %2 !=0) {
           return numberOfSteps(num-=1);
        }
        return  numberOfSteps(num/=2);

    }
}
