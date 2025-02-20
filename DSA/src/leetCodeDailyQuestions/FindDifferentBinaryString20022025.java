package leetCodeDailyQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDifferentBinaryString20022025 {
    public static String  findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for (String num : nums) {
            set.add(num);
        }
        return generateBinaryString("", nums.length, set);
    }

    private static String generateBinaryString(String current, int n, Set<String> set) {
        if (current.length() == n) {
            return set.contains(current) ? null : current;
        }

        // Try adding '0'
        String result = generateBinaryString(current + "0", n, set);
        if (result != null) return result;

        // Try adding '1'
        return generateBinaryString(current + "1", n, set);
    }

    public static void main(String[] args) {
        System.out.println(findDifferentBinaryString(new String[]{"00","01"}));
    }
}
