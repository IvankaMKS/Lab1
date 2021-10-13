package Lab2.Task1;

public class ExampleSubclass extends Example {
    public int b = 2;

    static {
        System.out.println("static example subclass 1");
    }

    {
        System.out.println("non-static example subclass 1");
    }

    public ExampleSubclass() {
        System.out.println("constructor - example subclass 1");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}