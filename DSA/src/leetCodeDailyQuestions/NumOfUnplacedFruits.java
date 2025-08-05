package leetCodeDailyQuestions;

public class NumOfUnplacedFruits {
    public static void main(String[] args) {
        int [] fruits={4,2,5};
        int [] baskets={3,5,4};

        int unplaced=0;
        boolean [] used =new boolean[fruits.length];

        for (int fruit : fruits) {
            boolean found = false;
            for (int j = 0; j < baskets.length; j++) {
                if (!used[j] && baskets[j] >= fruit) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            if (!found) {
                unplaced++;
            }
        }
        System.out.println(unplaced);
    }
}
