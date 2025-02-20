package recursion;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        printSumTriangle(new int[]{1, 2, 3, 4, 5});
    }

    private static void printSumTriangle(int[] arr) {
        if(arr.length<1) return;
        int [] temp=new int[arr.length-1];
        for(int i=0;i< arr.length-1;i++){
                temp[i]=arr[i]+arr[i+1];
        }
        printSumTriangle(temp);
        System.out.println(Arrays.toString(temp));

    }
}
