package Math;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public static boolean isHappy(int n) {
        Set<Integer>set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=generate(n);
            if(n==1) return true;
        }
        return false;

    }

    private static int generate(int n) {
        int num=0;
        while(n!=0){
            int x =n%10;
            num+=x*x;
            n/=10;

        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
