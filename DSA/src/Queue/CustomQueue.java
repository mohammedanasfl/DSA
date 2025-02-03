package Queue;

public class CustomQueue {
    protected int[] data;
    private static final int FIXED_SIZE = 10;
    public int end = 0;

    public CustomQueue() {
        this(FIXED_SIZE);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    public boolean insert(int value) {
        if (isFull()) {
            System.out.println("Queue is Full !!");
            return false;
        }
        data[end++] = value;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Already Empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int firstValue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Already Empty");
        }
        return data[0];
    }

    public void printAll() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Already Empty");
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    private boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty() {
        return end == 0;
    }
}
