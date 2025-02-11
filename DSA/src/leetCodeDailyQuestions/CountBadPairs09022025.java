package leetCodeDailyQuestions;

import java.util.HashMap;

public class CountBadPairs09022025 {
    public static long countBadPairs(int[] nums) {
                long n = nums.length;
                long totalPairs = (n * (n - 1)) / 2;

                HashMap<Integer, Long> map = new HashMap<>();
                long goodPairs = 0;

                for (int i = 0; i < n; i++) {
                    int key = nums[i] - i;
                    if (map.containsKey(key)) {
                        goodPairs += map.get(key);
                    }
                    map.put(key, map.getOrDefault(key, 0L) + 1);
                }

                return totalPairs - goodPairs;
            }



    public static void main(String[] args) {
        System.out.println(countBadPairs(new int[]{1,2,3,4,5}));
    }
}
