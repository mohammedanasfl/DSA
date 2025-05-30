package Array;


import java.util.*;

public class arrayRankTransform {
    public static void main(String[] args) {
        int [] arr={40,10,30,20};
        int [] res=new int[arr.length];
        int [] temp=Arrays.stream(arr).distinct().sorted().toArray();

        Map<Integer,Integer>map=new HashMap<>();

        for(int i=0;i< temp.length;i++){
            map.put(temp[i],i+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }

        System.out.println(Arrays.toString(arr));


    }
}
