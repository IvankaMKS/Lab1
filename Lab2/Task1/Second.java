package Lab2.Task1;

public class Second extends First {
    public String str2 = "second";

    static {
        System.out.println("static block of class Second");
    }

    {
        System.out.println("not a static block of class Second");
    }

    public Second() {
        System.out.println("constructor of class Second");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println();
    }

}