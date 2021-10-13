package Lab2.Task1;

public class ExampleSubclass1 extends ExampleSubclass {
    public int c = 3;

    static {
        System.out.println("static example subclass 2");
    }

    {
        System.out.println("non-static example subclass 2");
    }

    public ExampleSubclass1() {
        System.out.println("constructor - example subclass 1");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }

}