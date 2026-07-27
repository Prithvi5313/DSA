package Collection;

class QueueMethods {
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enqueue(int data) {
        if(!isFull()){
            queue[rear] = data;
            rear = (rear +1)%5;
            size++;
        }
        else
            System.out.println("Queue is full");

    }

    public void dequeue() {
        if(!isEmpty()){
            front = (front + 1)%5;
            size -- ;
        }
        else
            System.out.println("Queue is Empty");

    }


    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==5;
    }



    public void show() {
        for (int i = 0; i<size ;i++) {
            System.out.print(queue[(front+i)%5] + " ");
        }
        System.out.println();
    }
}
public class Queue {
    public static void main(String[] args) {
        QueueMethods q = new QueueMethods();
        q.dequeue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(25);
        q.enqueue(30);
        q.dequeue();
        q.show();
        System.out.println("size "+q.size());
    }
}
