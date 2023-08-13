package tasks.library;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{

    @Override
    public void insert(T data) {
        if(root==null) {
            root = new Node<T>(data);
            return;
        }

        Node<T> temp = root, n = new Node<T>(data);
        
        int compare;
        while(temp!=n) {
            compare = temp.data.compareTo(data);
            if(compare>0) {
                if(temp.left==null) 
                    temp.left = n;
                temp = temp.left;
            }
            else {
                if(temp.right == null)
                    temp.right = n;
                temp = temp.right;
            }
        }
    }


    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(60);
        bst.insert(50);
        bst.insert(80);
        bst.insert(70);
        bst.insert(90);
        bst.insert(20);
        bst.insert(40);
        bst.insert(550);
        bst.insert(47);
        bst.insert(32);
        bst.insert(56);
        bst.insert(78);

        bst.stringify();

    }


        
}
