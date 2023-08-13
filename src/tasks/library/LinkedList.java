package tasks.library;

import java.util.Iterator;
public class LinkedList<T> implements Iterable<T>{

    private static class Node<T> {
        T data;
        Node<T> next;
    
        Node(T data) {
            this.data = data;
        }

        public String toString(){
            return data.toString()+"->";
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
        ll.insert(8);

        System.out.println(ll);
        
        // for(LinkedList<Integer>.Node<T> n = ll.head;n!=null;n=n.next) {
        //     System.out.print(n);
        // }
        


        // ll.insertAtHead(71);
        // System.out.println(ll);

        // ll.deleteAtFront();
        // System.out.println(ll);

        // ll.deleteAtEnd();
        // System.out.println(ll);

        // ll.insertAt(4, 50);
        // System.out.println(ll);

        // ll.reverse();
        // System.out.println(ll);

        ll.reverseInGroupsOf(3);
        System.out.println(ll);
    }

    Node<T> head;

    int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public Node<T> head() {
        return head;
    }

    public int size() {
        return size;
    }

    public Node<T> get(int index) {
        Node<T> t = head;
        for(int i=0;i<index;i++) {
            t = t.next;
        }
        return t;
    }

    public void insert(T data) {
        if(head == null) {
            head = new Node<T>(data);
            size++;
            return;
        } 
        
        Node<T> traverser = head;
        while(traverser.next!=null) {
            traverser = traverser.next;
        }
        
        traverser.next = new Node<T>(data);
        size++;
    }

    public void insertAtHead(T data) {
        Node<T> temp = new Node<T>(data);
        temp.next = head;
        head=temp;
        size++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> iter = head;
            private int curIndex = 0;

            @Override
            public boolean hasNext() {
                return curIndex<size && iter!=null;
            }

            @Override
            public T next() {
                T data = iter.data;
                iter=iter.next;
                curIndex++;
                return data;
            }
            
        };
    }

    public void deleteAtEnd() {
        get(--size-1).next = null;
    }

    public void insertAt(int index, T data) {
        if(index>=size-1) {
            insert(data);
            return;
        }
        
        Node<T> in = new Node<T>(data), cursor = get(index-1);

        in.next = cursor.next;
        cursor.next = in;

        size++;
    }

    public void deleteAt(int index) {
        if(index>=size-1) {
            deleteAtEnd();
            return;
        }        

        Node<T> temp = get(index-1);
        Node<T> del = temp.next;

        temp.next = del.next;
        size--;
        del.data = null;
        del.next = null;
    }
    
    public void deleteAtFront() {
        Node<T> t = head.next;
        head.next = null;
        head.data = null;
        head=t;
        size--;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(T data : this) {
            sb.append(data.toString());
            sb.append("->");
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
    }

    public void reverse(){
        Node<T> next;
        Node<T> cursor = head;
        Node<T> prev = null;

        while(cursor!=null) {
            next = cursor.next;

            cursor.next = prev;
            prev = cursor;
            cursor = next;
        }

        head = prev;
    }

    public void reverseInGroupsOf(int k){
        if(k>=size) {
            reverse();
            return;
        }

        int cursorIndex = 0;
        Node<T> next , start = head;
        Node<T> previous = null;
        Node<T> cursor = head;

        while(true) {
            if((cursorIndex!=0 && cursorIndex%k == 0) || cursor==null ) {
                if(start==head)
                    head=previous;
                else
                    start.next.next = previous;

                start.next = cursor;

                previous = start;

                start = cursor;
            }

            if(cursor==null) break;

            next = cursor.next;
            
            cursor.next = previous;
            previous = cursor;
            cursor = next;

            cursorIndex++;
        }

    }



}
