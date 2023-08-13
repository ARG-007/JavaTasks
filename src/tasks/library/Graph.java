package tasks.library;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph<T> {
    LinkedList<Node<T>> nodes;

    public Graph(){
        nodes = new LinkedList<Node<T>>();
    }

    static class Node<T> {
        String id;
        T value;
        LinkedList<Node<T>> neighbours;

        Node(String name, T value) {
            this.id = name;
            this.value = value;
            this.neighbours = new LinkedList<>();
        }

        @SafeVarargs
        Node(String name, T value, Node<T> ...neigbours) {
            this(name, value);

            for(Node<T> n: neigbours) {
                this.neighbours.add(n);
                n.neighbours.add(this);
            }
        }
    }


    public String bfsTravesal(){
        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        HashSet<String> visited = new HashSet<>();
        StringBuilder sb = new StringBuilder();


        queue.add(nodes.peek());
        
        Node<T> current;
        while(!queue.isEmpty()) {
            current = queue.poll();
            visited.add(current.id);

            for(Node<T> neighbour:current.neighbours) {

                if(visited.contains(neighbour.id) == false){
                
                    queue.add(neighbour);
                    visited.add(neighbour.id);
                
                }
            }
            
            sb.append(String.format("ID: %s, Value: %d\n", current.id, current.value));
        }
        

        return sb.toString();
    }

    public String dfsTraversal() {
        Stack<Node<T>> stack = new Stack<Node<T>>();
        HashSet<String> visited = new HashSet<>();
        StringBuilder sb = new StringBuilder();


        stack.add(nodes.get(0));
        
        Node<T> current;
        while(!stack.isEmpty()) {
            current = stack.pop();
            visited.add(current.id);

            for(Node<T> neighbour:current.neighbours) {

                if(visited.contains(neighbour.id) == false){
                
                    stack.push(neighbour);
                    visited.add(neighbour.id);
                
                }
            }
            
            sb.append(String.format("ID: %s, Value: %d\n", current.id, current.value));
        }
        

        return sb.toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(Node<T> node : nodes) {
            sb.append(node.id+"->");
            for(Node<T> n : node.neighbours) {
                sb.append(n.id+", ");
            }

            sb.append("\n");
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();
        Node<Integer> a = new Node<Integer>("A", 1);
        Node<Integer> e = new Node<>("E",5, a);
        Node<Integer> b = new Node<Integer>("B",  2, a);
        Node<Integer> d = new Node<>("D",4, e);
        Node<Integer> f = new Node<>("F", 6, e,b);
        Node<Integer> c = new Node<>("C", 3, b);
        Node<Integer> h = new Node<>("H", 7, b, c);
        Node<Integer> g = new Node<>("G", 8, b);

        graph.nodes.add(a);        
        graph.nodes.add(b);        
        graph.nodes.add(c);        
        graph.nodes.add(d);
        graph.nodes.add(e);
        graph.nodes.add(f);
        graph.nodes.add(h);
        graph.nodes.add(g);

        System.out.println(graph);
        System.out.println(graph.bfsTravesal());
        System.out.println(graph.dfsTraversal());

    }



}
