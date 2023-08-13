package tasks.library;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
    Node<T> root= null;
    int height = 0;
    
    static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
        }
    }

    public void insert(T data) {
        if(root==null) {
            root = new Node<T>(data);
            return;
        }
        
        Queue<Node<T>> bfQueue = new LinkedList<>();
        bfQueue.add(root);

        while(!bfQueue.isEmpty()) {
            Node<T> present=bfQueue.remove();
            if(present.left==null) {
                present.left = new Node<T>(data);
                break;
            }
            else if(present.right == null) {
                present.right = new Node<T>(data);
                break;
            }
            else {
                bfQueue.add(present.left);
                bfQueue.add(present.right);
            }
        }        
    }

    

    public void convertToString(Node<T> node, String prefix, boolean isLeft) {
        if(node==null)
            return ;

        System.out.print(prefix);
        System.out.print(isLeft ? "├──" : "└──" );
        System.out.print(node.data+"\n");

        convertToString(node.left, prefix + (isLeft ? "│  " : "   "), true);
        convertToString(node.right, prefix + (isLeft ? "│  " : "   "), false);

    }

    public void stringify(){
        convertToString(root,"", false);
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        
        


        return "";
    }

    public static void main(String[] args) {

        BinaryTree<Integer> bt = new BinaryTree<>();
        
        bt.insert(1);
        bt.insert(2);
        bt.insert(3);
        bt.insert(4);
        bt.insert(5);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);
        bt.insert(6);

        bt.stringify();

    }

}
