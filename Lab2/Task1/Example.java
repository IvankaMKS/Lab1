package Lab2.Task1;

public class Example {
    public int a = 1;

    static {
        System.out.println("static example");
    }

    {
        System.out.println("non-static example");
    }

    public Example() {
        System.out.println("constructor - example");
        System.out.println("a: " + a);
    }
}