package string;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortPeople {
    public static void main(String[] args) {
        String [] names={"Mary","John","Emma"};
        int [] height={180,165,170};

//        for(int i=0;i<names.length;i++){
//            for(int j=i+1;j< names.length;j++){
//                if(height[i]<height[j]){
//                    String temp=names[i];
//                    names[i]=names[j];
//                    names[j]=temp;
//                }
//            }
//        }
        String [] sortedNames= IntStream.range(0, names.length)
                        .boxed()
                        .sorted((i,j)->Integer.compare(height[j],height[i]))
                        .map(i->names[i]).toArray(String[]::new);
        System.out.println(Arrays.toString(sortedNames));
    }
}
