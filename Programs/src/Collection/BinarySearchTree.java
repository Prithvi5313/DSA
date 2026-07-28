package Collection;


class TNode{
    int data;
    TNode left;
    TNode right;
    TNode(int data){
        this.data = data;
    }
}

class BinarySearchTreeMethods{
    TNode root;
    public void insert(int data){
        root = insertRec(root, data);
    }
    private TNode insertRec(TNode root , int data) {
        if (root == null) {
            root = new TNode(data);
        } else if (root.data > data) {
            root.left = insertRec(root.left,data);
        } else if (root.data < data) {
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    public void inOrder(){
        inOrderRec(root);
    }
    private void inOrderRec(TNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
    public void preOrder(){
        preOrderRec(root);
    }
    private void preOrderRec(TNode root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }

    }
}
public class BinarySearchTree {
    public static void main (String[] args){
        BinarySearchTreeMethods bst = new BinarySearchTreeMethods();
        bst.insert(8);
        bst.insert(7);
        bst.insert(12);
        bst.insert(5);
        bst.insert(15);
        bst.inOrder();
        System.out.println();
        bst.preOrder();
    }
}
