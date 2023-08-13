package tasks.library;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T>{
    Node<T> head;
    int size;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int curIndex = 0;
            Node<T> cursor = head;
            @Override
            public boolean hasNext() {
                return curIndex<size;
            }

            @Override
            public T next() {
                T data = cursor.data;
                cursor=cursor.next;
                curIndex++;
                return data;
            }
            
        };
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> previous;

        Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.previous = prev;
            this.next = next;
        }
    }

    public DoublyLinkedList(){
        size = 0;
        head = null;
    }

    T unlink(Node<T> node) {
        T data = node.data;
        Node<T> next = node.next;
        Node<T> prev = node.previous;

        if(prev==null) {
            head = next;
        } else {
            prev.next = null;
            node.previous = null;
        }

        if(next!=null){
            next.previous=prev;
            node.next=null;
        }

        node.data=null;
        size--;
        return data;
    }
    
    public void insert(T data) {
        if(head == null) {
            insertAtFront(data);
            return;
        }
        
        Node<T> temp = head;
        while(temp.next!=null) temp = temp.next;

        temp.next = new Node<T>(data, temp, null);
        size++;
    }

    public void insertAtFront(T data){
        Node<T> temp = new Node<T>(data, null, head);
        if(head!=null) 
            head.previous = temp;
        head=temp;
        size++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(T data: this) {
            sb.append(data);
            sb.append(" <-> ");
        }
        sb.delete(sb.length()-5, sb.length()-1);
        return sb.toString();
    }

    public T remove(){
        if(head==null) {
            return null;
        }

        Node<T> last = head;
        while(last.next!=null) last=last.next;

        return unlink(last);

    }

    public void reverse() {
        Node<T> prev = null;
        Node<T> cursor = head;

        while(cursor!=null) {
            cursor.previous = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = cursor.previous; // previous is next now
        }

        head = prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.insert(56);
        dll.insert(76);
        dll.insert(86);
        dll.insert(96);
        System.out.println(dll);
        dll.insertAtFront(106);
        System.out.println(dll);
        dll.remove();
        System.out.println(dll);

        dll.reverse();
        System.out.println(dll);
    }
}
