package slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class TotalFruit {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,2};
        Map<Integer,Integer>map=new HashMap<>();
        int left=0,right=0,maxCount=0;
        while(right < arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
            right++;
        }
        System.out.println(maxCount);
    }
}
