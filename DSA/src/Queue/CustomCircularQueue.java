package Queue;

public class CustomCircularQueue {
    protected  int []data;
    private static final int FIXED_SIZE = 10;
    protected int front = 0;
    protected int end=0;
    protected int size=0;
    public CustomCircularQueue(){
        this(FIXED_SIZE);
    }
    public CustomCircularQueue(int size){
        data=new int[size];
    }

    private boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        int remove=data[front++];
        front=front%data.length;
        size--;
        return remove;
    }
    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty !!");
        }
        int i= front;
        do{
            System.out.print(data[i]+"->");
            i++;
            i%=data.length;
        }while (i!=end);
        System.out.println();
    }
}
