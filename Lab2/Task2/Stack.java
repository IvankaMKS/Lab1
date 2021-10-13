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

        if (node == null) { // перевірка чи хіт повний
            System.out.println("Heap Overflow");
            return;
        }
        System.out.println(item);
        node.data = item; //встановлює дані
        node.next = top; // вказує на поточний верхній елемент списку

        top = node;  // оновляє
    }

    //public void pop() throws Exception {
        // перевірка на недоповнення стека
        //if (isEmpty()) {
           // throw new Exception("Stack underflow");
      //  }
        //System.out.println(peek());

        //top = top.next; // оновляє верхній покажчик, щоб вказати на наступний вузол
   // }

    public int peek() throws Exception {
        // перевіряє наявність порожнього стеку
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
