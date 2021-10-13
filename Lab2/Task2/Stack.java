package Lab2.Task2;
import java.util.Iterator;

public class Stack implements Iterable<Node> {
    private Node top;
    private Node current;

    public Stack() {
        this.top = null;
    }

    public void push(int item) {
        Node node = new Node();

        if (node == null) { 
            System.out.println("Heap Overflow");
            return;
        }
        System.out.println(item);
        node.data = item; 
        node.next = top; 

        top = node;
    }
    
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack underflow");
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        String result = "[ ";
        while (top != null) {
            result += top.getData() + ", ";
            top = top.getNext();
        }
        result += "]";
        return result;
    }

    class MyIterator implements Iterator<Node> {
        public boolean hasNext() {
            if (current == null) {
                current = top;
            } else {
                current = current.getNext();
            }
            return (current != null);
        }

        public Node next() {
            return current;
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new MyIterator();
    }

}
