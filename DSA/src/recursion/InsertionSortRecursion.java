package recursion;

import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int [] arr={12, 11, 13, 5, 6};
        insertionSortRecursion(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSortRecursion(int[] arr, int n) {
        if(n<=1) return;

        insertionSortRecursion(arr,n-1);
        int key=arr[n-1];
        int j=n-2;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
}
