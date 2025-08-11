package Array;

public class MaxArea {
    public static void main(String[] args) {

        int [] height={1,8,6,2,5,4,8,3,7};
        int maxArea=0;

//        for(int i=0;i<height.length;i++){
//            for(int j=i+1;j<height.length;j++){
//                int heights = Math.min(height[i], height[j]);
//                int width = j - i;
//                int area = heights * width;
//                maxArea=Math.max(maxArea,area);
//            }
//        }

        //optimised approach
        int left=0,right=height.length-1;
        while(left< right){
            int area= ((Math.min(height[left],height[right])) *(right-left));
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]) left++;
            else right--;
        }
        System.out.println(maxArea);
    }
}
