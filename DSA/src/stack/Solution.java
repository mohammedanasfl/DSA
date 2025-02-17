package stack;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Queue;

public class Solution {

    private Queue<Integer>queue;

    public Solution(){
        queue=new ArrayDeque<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.poll());
        }

    }

    public int pop() {
        return queue.poll();

    }

    public int top() {
       return  queue.peek();

    }

    public boolean empty() {

        return queue.isEmpty();
    }
}
