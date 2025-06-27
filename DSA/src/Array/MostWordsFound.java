package Array;

public class MostWordsFound {
    public static void main(String[] args) {
        String [] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int len=0;
        for(String s:sentences){
            String []arr=s.split(" ");
            len=Math.max(len,arr.length);
        }
        System.out.println(len);
    }
}
