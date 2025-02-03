package stack;

public class CustomStack {
    protected int data[];
    private static final int FIXED_SIZE=10;
    public int ptr=-1;

    public CustomStack(){
        this(FIXED_SIZE);
    }
    public CustomStack(int size) {
        data=new int[size];
    }
    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is Already full");
            return false;
        }
        ptr++;
        data[ptr]=value;
        return true;
    }



    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty ");
        }
        return data[ptr--];
    }
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is Empty to Peek");
        }
        return data[ptr];
    }
    private boolean isFull() {
        return data.length-1== ptr;
    }
    private  boolean isEmpty(){
        return ptr ==-1;
    }
}
