package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountPairs {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>(List.of(-1,1,2,3,1));
        int target=2;
        Collections.sort(list);
        int left=0,right=list.size()-1,count=0;
        while(left<right){
            int sum=list.get(left)+ list.get(right);
            if(sum<target){
                count+=right-left;
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(count);

    }
}
