package leetCodeDailyQuestions;

import java.util.Arrays;

public class RepairCars16032025 {
    public static int repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks);  // Sorting helps prioritize efficient mechanics
        int low = 1, high = ranks[0] * cars * cars;  // Setting search range

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canRepairInTime(ranks, cars, mid)) {
                high = mid;  // Try to find a smaller valid time
            } else {
                low = mid + 1;  // Increase time limit
            }
        }

        return low;  // The minimum time required
    }

    private static boolean canRepairInTime(int[] ranks, int cars, int timeLimit) {
        int totalCarsRepaired = 0;

        for (int rank : ranks) {
            int maxCars = (int) Math.sqrt(timeLimit / rank);  // Formula: n = sqrt(T / r)
            totalCarsRepaired += maxCars;

            if (totalCarsRepaired >= cars) {
                return true;  // If enough cars are repaired, return true
            }
        }

        return false;  // Not enough cars repaired within timeLimit
    }
    public static void main(String[] args) {
        int[] ranks1 = {4, 2, 3, 1};
        int cars1 = 10;
        System.out.println(repairCars(ranks1, cars1)); // Output: 16

        int[] ranks2 = {5, 1, 8};
        int cars2 = 6;
        System.out.println(repairCars(ranks2, cars2)); // Output: 16
    }
}
