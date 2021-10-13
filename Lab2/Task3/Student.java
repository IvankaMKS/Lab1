package Lab2.Task3;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private List<Mark> mark;
    private List<Subject> subjects;

    public Student(String firstName, String lastName, List<Mark> rating, List<Subject> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = rating;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student: " + firstName +
                " " + lastName +
                ", Subject: " + subjects +
                ", Mark: " + mark +
                '.';
    }
}
