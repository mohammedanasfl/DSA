package leetCodeDailyQuestions;

import java.util.*;

public class sample {
    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        int count=0;
        Map<String,Float>map=new HashMap<>();
        for(int i=0;i<products.size();i++){
            map.put(products.get(i),productPrices.get(i));
        }
        for(int i=0;i<productSold.size();i++){
            Float actualPrice=map.get(productSold.get(i));
            Float sold=soldPrice.get(i);
            if(Float.compare(actualPrice,sold)!=0){
                count++;
            }
        }
        return count;

    }



    public static void main(String[] args) {
//        PriorityQueue<Integer>pq=new PriorityQueue<>();
//        pq.add(40);
//        pq.add(50);
//        pq.add(10);
//        pq.add(20);
//        pq.add(30);
//
//        while (pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        String s1="listen";
        String s2="silent";
        char []a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));


    }
}

