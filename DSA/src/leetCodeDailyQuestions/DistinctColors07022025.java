package leetCodeDailyQuestions;

import java.util.*;

public class DistinctColors07022025 {

    public static int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int[] query : queries) {
            int ball = query[0], color = query[1];

            if (ballToColor.containsKey(ball)) {
                int oldColor = ballToColor.get(ball);

                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    colorCount.remove(oldColor);
                }
            }

            ballToColor.put(ball, color);

            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);

            result.add(colorCount.size());
        }

        return result.stream().mapToInt(i -> i).toArray();

    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(queryResults(4,new int[][]{{0,1},{0,4},{1,2},{1,5},{1,4}})));
    }
}
