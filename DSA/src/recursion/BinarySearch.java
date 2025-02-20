package recursion;



public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={12,23,34,45,56,67,78};
        int target=43;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }

    private static int binarySearch(int[] arr, int target, int s, int e) {
        if(s>e) return -1;
        int mid=s+(e-s)/2;
        if(arr[mid] == target) return mid;

        if(target< arr[mid]) return binarySearch(arr,target,s,mid-1);
        return binarySearch(arr,target,mid+1, e);
    }
}
