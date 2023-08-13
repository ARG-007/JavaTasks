package tasks.programs;

import java.util.Iterator;

import tasks.interfaces.TASK;
import tasks.library.DoublyLinkedList;
import tasks.library.Helper;
import tasks.library.LinkedList;


public class Task_44 implements TASK{
    public Task_44(){
        showDetails(44, "\nTasks:\n\t1: Find Middle Element\n\t2: Reverse a Linked List\n\t3: Reverse Doubly Linked List\n\t4: Reverse In Groups On Linked List");
    }

    static <E> E findMiddle(LinkedList<E> ll) {
        int iterate = ll.size()/2;
        Iterator<E> iter = ll.iterator();
        E data = null;

        while((iterate--)!=-1 && iter.hasNext()) {
            data = iter.next();
        }

        return data;

        

    }

    static void reverseInGroups(LinkedList<Integer> ll){}

    @Override
    public void execute() {
        int[] arr = Helper.toIntArray(input("Enter The Elements: ").split(" "));
        // int arr[] = {1, 2, 3 ,4 ,5, 6, 7, 8, 9, 0};

        LinkedList<Integer> ll = new LinkedList<>();
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        for(int i:arr) {
            ll.insert(i);
            dll.insert(i);
        }

        System.out.println("Created Linked List: "+ ll);
        System.out.println("Created Doubly Linked List: "+ dll);

        print("Task 1:\n"+"'".repeat(80)+'\n');

        System.out.println("Middle Element: "+findMiddle(ll));

        print("-".repeat(80)+"\nTask 2:\n"+"'".repeat(80)+'\n');
        
        ll.reverse();
        System.out.println("Reversed Singly Linked List: "+ll);
        
        print("-".repeat(80)+"\nTask 3:\n"+"'".repeat(80)+'\n');
        
        dll.reverse();
        System.out.println("Reversed Doubly Linked List: "+dll);
        
        print("-".repeat(80)+"\nTask 4:\n"+"'".repeat(80)+'\n');
        
        ll.reverseInGroupsOf(3);
        System.out.printf("Reversed In Groups of %d : %s\n", 3, ll);
        
        print("-".repeat(80));
    }

    public static void main(String[] args) {
        new Task_44().execute();
    }
}