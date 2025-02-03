package Queue;

public class Main {
    public static void main(String[]args) throws Exception {
        CustomQueue queue=new CustomQueue();
        queue.insert(12);
        queue.insert(32);
        queue.insert(42);
        queue.insert(52);

        queue.remove();
        queue.printAll();

        CustomCircularQueue circularQueue=new CustomCircularQueue(5);
        circularQueue.insert(10);
        circularQueue.insert(20);
        circularQueue.insert(30);
        circularQueue.insert(40);
        circularQueue.insert(50);
        circularQueue.remove();
        circularQueue.insert(10);
        circularQueue.display();


    }
}
