package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortEvenOdd {
    public static void main(String[] args) {
        int[] nums={4,1,2,3};
        for (int i = 0; i < nums.length - 1; i += 2) {
            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 1; i < nums.length - 1; i += 2) {
            for (int j = i + 2; j < nums.length; j += 2) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sortEvenOdd(nums)));
    }
    public static  int[] sortEvenOdd(int[] nums) {
        List<Integer> even= new ArrayList<>(IntStream.range(0, nums.length)
                .filter(i->i%2 ==0).map(i->nums[i])
                .boxed()
                .toList());
        List<Integer> odd= new ArrayList<>(IntStream.range(0, nums.length)
                .filter(i->i%2 !=0).map(i->nums[i])
                .boxed()
                .toList());
        Collections.sort(even);
        odd.sort(((i, j) -> Integer.compare(j, i)));
        int evenIndex = 0, oddIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(evenIndex++);
            } else {
                nums[i] = odd.get(oddIndex++);
            }
        }
        return nums;
    }
}
