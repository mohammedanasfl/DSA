package recursion;

public class ReverseString {
    public static void main(String[] args) {
        char [] arr={'h','e','l','l','o'};
        reverseString(arr,0,arr.length-1);
        System.out.println(new String(arr));

    }
    public static void reverseString(char[] arr,int s,int e) {
        if(s>=e) return;
        char temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverseString(arr,s+1,e-1);
    }
}
