package BinarySearch;

public class SearchMatrix {
    public static void main(String[] args) {
        int [][]matrix={
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target=5;

//        for(int [] row:matrix){
//
//            int left=0,right=row.length-1;
//            while(left<=right){
//                int mid=left+(right-left)/2;
//
//                if(row[mid]==target){
//                    System.out.println(true);
//                    break;
//                }
//                else if(row[mid]<target){
//                    left=mid+1;
//                }else {
//                    right=mid-1;
//                }
//            }
//        }
//        System.out.println(false);
        System.out.println(search(matrix,target));
    }

    private static boolean search(int[][] matrix, int target) {
        int row=0,col=matrix[0].length-1;

        while(row<matrix.length && col >=0){
            if(matrix[row][col]==target) return true;
            else if (matrix[row][col]>target) col--;
            else row++;
        }
        return false;
    }
}
