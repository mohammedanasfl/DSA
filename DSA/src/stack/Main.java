package stack;

public class Main {

    public static void main(String [] args) throws StackException {
        CustomStack stack=new CustomStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.print(stack.peek());
    }
}
