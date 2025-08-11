package Array;

public class LargestRectangleArea {
    public static void main(String[] args) {
        int [] heights={2,1,5,6,2,3};
        int masArea=0;
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int left=i;
            while(left >0 && heights[left-1] >=height) left--;
            int right=i;
            while(right< heights.length-1 && heights[right+1]>=height) right++;
            int width=right-left+1;
            masArea=Math.max(masArea,height*width);
        }
        System.out.println(masArea);
    }
}
