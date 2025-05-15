package BinarySearch;

public class CountNegatives {
    public static void main(String[] args) {
        int [][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        int count=0;

        for( int [] row:grid){
            int left=0,right= row.length-1;
            while(left<=right){

                int mid=left+(right-left)/2;

                if(row[mid] <0){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            count+= row.length-left;
        }
        System.out.println(count);

    }
}
