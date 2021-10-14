package Lab2.Task1;

public abstract class Person {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname =surname;
    }

    public void PIB() {
        System.out.println("name of person: " + name + " " + surname);
        System.out.println();
    }

    static {
        System.out.println("Person static");
    }
}