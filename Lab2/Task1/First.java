package Lab2.Task1;

public class First {
    public String str1 = "first";

    static {
        System.out.println("static block of class First");
    }

    {
        System.out.println("not a static block of class First");
    }

    public First() {
        System.out.println("constructor of class First");
        System.out.println("str1 = " + str1);
        System.out.println();
    }
}