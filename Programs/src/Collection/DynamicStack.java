package Collection;

class DynamicStackMethods {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data) {
       if(size() == capacity){
           expand();
       }
        else {
            stack[top] = data;
            top++;
        }
    }
    private void expand(){
        capacity = capacity*2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,size());
        stack = newStack;
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            int data = stack[top];
            stack[top] = 0;
            shrink();
        }

    }
    private void shrink(){
        if(size() <= (capacity/2)/2)
            capacity /= 2;
        int[] newStack = new int[capacity];
        System.arraycopy(stack,0,newStack,0,size());
        stack = newStack;
    }

    public int peek() {
        top--;
        return stack[top];
    }


    public int size() {
        return top;
    }
    public boolean isEmpty() {
        return top <=0;
    }


    public void show() {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class DynamicStack {
    public static void main(String[] args) {
        DynamicStackMethods s = new DynamicStackMethods();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(15);
        s.show();
        s.push(15);
        s.show();
        s.push(15);
        s.show();
        s.push(15);
        s.show();
        s.pop();
        s.show();
        s.pop();
        s.show();
        s.pop();
        s.show();



    }
}
