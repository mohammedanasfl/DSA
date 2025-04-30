package LinkedList;


public class LL {
    private Node head;
    private Node tail;
    int size;

    public LL(int size) {
        this.size = size;
    }

    private class Node{
      private int value;
      private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public  void insertAtFirst(int value){

        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail == null){
            tail=head;
        }
        size++;
    }
    public void insertAtLast(int value){
        if(tail==null){
            insertAtFirst(value);
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }
    public void insert(int value,int index){
        if(index == 0) insertAtFirst(value);
        if(index== size) insertAtLast(value);

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }
}
