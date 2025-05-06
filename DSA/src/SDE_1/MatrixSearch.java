package SDE_1;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] mat = {{3, 30, 38},
                {20, 52, 54},
                {35, 60, 69}};
        int x = 35;

        if(matBinarySearch(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }

    private static boolean matSearch(int[][] mat, int x) {
        int n=mat.length,m=mat[0].length;
        for (int[] ints : mat) {
            for (int j = 0; j < m; j++) {
                if (ints[j] == x) {
                    return true;
                }
            }
        }
        return false;
}
static  boolean matBinarySearch(int [][] matrix,int target){
    int s=0;
    int r=matrix.length;
    int c=matrix[0].length;
    int e=(r*c)-1;
    while(s<=e){
        int mid=(s+e)/2;
        int row=mid/c;
        int col=mid%c;
        if(matrix[row][col]==target)
            return true;
        else if(matrix[row][col]<target)
            s=mid+1;
        else
            e=mid-1;
    }
    return false;
}

}
