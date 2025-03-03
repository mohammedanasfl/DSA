package leetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class kthFactor {
    public static void main(String[] args) {
        System.out.println(kthFactor(12,3));

    }
    public static int kthFactor(int n, int k) {
        List<Integer> set=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n % i ==0) set.add(i);
        }
        System.out.println(set);
        return k>=set.size()?-1:set.get(k-1);
    }
}
