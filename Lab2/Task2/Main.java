package Lab2.Task2;

public class Main {
    public static void main(String[] args) {
        final Stack stack = new Stack();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("After deleting the first item: " );
        stack.delete();
        System.out.println(stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.delete();stack.delete();stack.delete();stack.delete();
    }
}
