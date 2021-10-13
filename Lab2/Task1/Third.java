package Lab2.Task1;

public class Third extends Second {
    public String str3 = "third";

    static {
        System.out.println("static block of class Third" );
        System.out.println();
    }

    {
        System.out.println("not a static block of class Third");
    }

    public Third() {
        System.out.println("constructor of class Third");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println();
    }

}