package recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int [] arr={5,1,4,2,8};
        int n=arr.length;
        bubbleSortRecursion(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void  bubbleSortRecursion(int[] arr, int n) {
        if(n==1) return;
        int count=0;
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count+=1;
            }
        }
        if(count==0)return;
        bubbleSortRecursion(arr,n-1);
    }
}
