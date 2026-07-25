package Collection;

 class StackMethods {
     int[] stack = new int[5];
     int top = 0;

     public void push(int data) {
         if(top ==5){
             System.out.println("Stack is full");
         }
         else {
             stack[top] = data;
             top++;
         }
     }

     public void pop() {
         if(isEmpty()){
             System.out.println("Stack is empty");
         }
         else{
             top--;
             int data = stack[top];
             stack[top] = 0;
         }

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
     }
 }
public class Stack {
    public static void main(String[] args) {
        StackMethods s = new StackMethods();
        s.pop();
        s.push(5);
        s.push(10);
        s.push(15);
        s.pop();
        System.out.println(s.peek());
        s.show();
        System.out.println("size " + s.size());
        System.out.println("is Empty :" + s.isEmpty());


    }
}
