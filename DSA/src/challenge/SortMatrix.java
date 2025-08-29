package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMatrix {
    public static void main(String[] args) {
        int [][] grid={
                {1,7,3},{9,8,2},{4,5,6}
        };

        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            List<Integer>diagonal=new ArrayList<>();
            int r=i,c=0;
            while(r<m && c<n){
                diagonal.add(grid[r][c]);
                r++;c++;
            }
            diagonal.sort(Collections.reverseOrder());
            r=i;c=0;
            for(int val:diagonal){
                grid[r][c]=val;
                r++;c++;
            }
        }
        for(int i=1;i<m;i++){
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
