package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list =new LL(1);
        list.insertAtFirst(23);
        list.insertAtFirst(34);
        list.insertAtFirst(45);
        list.insertAtLast(12);
        list.insertAtLast(20);
        list.display();
    }
}
