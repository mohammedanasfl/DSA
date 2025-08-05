package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencySort {
    public static void main(String[] args) {
        int [] nums={1,1,2,2,2,3};

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Convert array to Integer[] for custom sorting
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(boxed, (a, b) -> {
            int fa = freqMap.get(a);
            int fb = freqMap.get(b);
            if (fa == fb) {
                return b - a; // Decreasing value if frequency same
            } else {
                return fa - fb; // Increasing frequency
            }
        });

        // Convert back to int[]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = boxed[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
