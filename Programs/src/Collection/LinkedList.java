package Collection;

class Node{
    int data;
    Node next;
}
class LinkedListMethods{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node ;
    }

    public void insertAt(int index,int data) {
        Node node = new Node();
        node.data = data;
        Node n = head;
        Node prev = new Node();
        if (index == 0) {
            insertAtStart(data);
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){

        if(index == 0)
                head = head.next;
        else{
            Node n = head;
            Node n1 = new Node();
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }

    }

    public void show(){
        Node node = head ;
        while(node.next != null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LinkedListMethods l = new LinkedListMethods();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insertAtStart(5);
        l.insertAt(2,15);
        l.insertAt(0,15);
        l.deleteAt(0);
        l.show();
    }

}
