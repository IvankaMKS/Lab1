package Lab2.Task3;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Subject> subjects1 = new ArrayList<>();
        subjects1.add(new Subject("System programming"));
        subjects1.add(new Subject("Higher mathematics"));

        List<Mark> mark1 = new ArrayList<>();
        mark1.add(new Mark(5));
        mark1.add(new Mark(5));

        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(new Subject("Object-oriented programming"));
        subjects2.add(new Subject("English"));

        List<Mark> mark2 = new ArrayList<>();
        mark2.add(new Mark(5));
        mark2.add(new Mark(4));

        List<Subject> subjects3 = new ArrayList<>();
        subjects3.add(new Subject("Project programming"));
        subjects3.add(new Subject("Operating systems"));

        List<Mark> mark3 = new ArrayList<>();
        mark3.add(new Mark(4));
        mark3.add(new Mark(5));

        Student student1 = new Student("Ivanna", "Maksymiv", mark1, subjects1);
        Student student2 = new Student("Alina", "Vantyh", mark2, subjects2);
        Student student3 = new Student("Yana", "Beres", mark3, subjects3);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

    }
}
