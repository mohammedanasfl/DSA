package Array;

import java.util.PriorityQueue;

public class TakeGiftsFromRichestPile {
    public static void main(String[] args) {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        System.out.println(pickGifts(gifts, k)); // Output: 29
    }

    public static long pickGifts(int[] gifts, int k) {
        // Max heap using a priority queue with reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int gift : gifts) {
            maxHeap.add(gift);
        }

        while (k-- > 0 && !maxHeap.isEmpty()) {
            int max = maxHeap.poll(); // Take the largest pile
            int reduced = (int) Math.floor(Math.sqrt(max)); // Reduce it
            maxHeap.add(reduced); // Put it back
        }

        // Sum remaining gifts
        long sum = 0;
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }

        return sum;
    }
}

