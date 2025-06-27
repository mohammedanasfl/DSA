package Array;

public class FindKDistantIndices24062025 {
    public static void main(String[] args) {
        int [] arr={3,4,9,1,3,9,5};
        int k=1,key=9;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((i-j)<=k && arr[j]==key){
                    System.out.println(i);
                }
            }
        }
    }
}
