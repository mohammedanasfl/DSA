package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7},7));

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        backTrack(result,cur,candidates,target,0);
        return result;

    }

    private static void backTrack(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                cur.add(candidates[i]);
                backTrack(result, cur, candidates, target - candidates[i], i);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
