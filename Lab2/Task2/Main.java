package Lab2.Task2;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (Node node : stack) {
            System.out.print(node.getData() + " ");
        }

        System.out.println("\n" + "The top element is " + stack.peek());
        System.out.println("Is stack Empty?  " + stack.isEmpty());
    }
}
