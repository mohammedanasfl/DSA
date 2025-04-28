package Array;

import java.util.Arrays;

public class AssignElements {
    public static int[] assignElements(int[] groups, int[] elements) {
        int[] result = new int[groups.length];

        for (int i = 0; i < groups.length; i++) {
            result[i] = -1; // Assume no match

            for (int j = 0; j < elements.length; j++) {
                if (groups[i] % elements[j] == 0) {
                    result[i] = j;
                    break; // First match found, move on
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(assignElements(new int[]{8,4,3,2,4},new int[]{4,2})));
    }
}
