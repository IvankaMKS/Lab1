package Lab2.Task4;

public class Student {
    final private String id;
    private final String nameAndSurname;

    public String getId() {
        return id;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public Student(String id, String nameAndSurname) {
        this.id = id;
        this.nameAndSurname = nameAndSurname;
    }
}