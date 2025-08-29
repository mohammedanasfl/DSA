package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalSort {
    public static void main(String[] args) {
        int [][] grid={
                {11,25,66,1,69,7},
                {23,55,17,45,15,52},
                {75,31,36,44,58,8},
                {22,27,33,25,68,4},
                {84,28,14,11,5,50}
        };
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            List<Integer> diagonal=new ArrayList<>();
            int r=i,c=0;
            while(r<m && c<n){
                diagonal.add(grid[r][c]);
                r++;c++;
            }
            Collections.sort(diagonal);
            r=i;c=0;
            for(int val:diagonal){
                grid[r][c]=val;
                r++;c++;
            }
        }
        for(int i=1;i<n;i++){
            List<Integer>diagonal=new ArrayList<>();
            int r=0,c=i;
            while(r<m && c<n){
                diagonal.add(grid[r][c]);
                r++;c++;
            }
            Collections.sort(diagonal);
            r=0;c=i;
            for(int val:diagonal){
                grid[r][c]=val;
                r++;c++;
            }
        }
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
}
