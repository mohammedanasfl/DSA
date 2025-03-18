package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NiceTeams {
    public static int maxPairs(List<Integer> skillLevel, int minDiff) {
        // Write your code here
        Collections.sort(skillLevel);
        int left = 0, right = 1, count = 0;

        while (right < skillLevel.size()) {
            int curr=skillLevel.get(right) - skillLevel.get(left);
            if ( curr>= minDiff) {
                count++;
                left++;
                right++;
            } else {
                right++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(maxPairs(Arrays.asList(3,4,5,2,1,1),3));
    }
}
