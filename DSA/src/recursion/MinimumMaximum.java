package recursion;

public class MinimumMaximum {
    public static void main(String[] args) {
        int [] arr={12,34,45,6,7,32,90,54};
        System.out.println(minimumOfArray(arr,arr.length));
        System.out.println(maximumOfArray(arr,arr.length));
    }

    private static int minimumOfArray(int[] arr, int length) {
        if(length == 1) return  arr[0];
        return Math.min(arr[length-1],minimumOfArray(arr,length-1));
    }
    private static int maximumOfArray(int[] arr, int length) {
        if(length == 1) return  arr[0];
        return Math.max(arr[length-1],maximumOfArray(arr,length-1));
    }
}
