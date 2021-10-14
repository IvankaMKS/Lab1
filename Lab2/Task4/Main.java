package Lab2.Task4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("English", 5));
        subjects.add(new Subject("Maths", 4));
        subjects.add(new Subject("Physic", 5));
        List<Subject> subjects2 = new ArrayList<>();
        subjects2.add(new Subject("English", 3));
        subjects2.add(new Subject("Maths", 5));
        subjects2.add(new Subject("Physic", 4));

        Student student1 = new Student("Andriy","Koval", subjects, 51);
        Student student2 = new Student("Maksym","Valchak", subjects2, 24);

        main.students.add(student1);
        main.students.add(student2);
        main.students.get(0).setGradeSubject("English", 5);
        main.students.get(0).setGradeSubject("Maths", 5);
        main.students.get(0).setGradeSubject("Physic", 5);
        main.students.get(1).setGradeSubject("English", 5);
        main.students.get(1).setGradeSubject("Maths", 5);
        main.students.get(1).setGradeSubject("Physic", 4);

        main.addSubjectToAll(new Subject("History"));
        main.students.get(0).setGradeSubject("History", 5);
        main.students.get(1).setGradeSubject("History", 4);
        main.printAllStudents();

        System.out.println("The student with the highest average score: " + main.GreatestAverageGrade());
        System.out.println(main.formMap("Physic"));
    }

    private void printAllStudents() {
        for(Student s : students) {
            System.out.println(s);
        }
    }

    private void addSubjectToAll(Subject subject) {
        for(Student s : students) {
            s.addSubject(new Subject(subject.getName(), subject.getGrade()));
        }
    }

    private Student GreatestAverageGrade() {
        Student result = students.get(0);

        for (Student s : students) {
            if(s.getGradeAverage() > result.getGradeAverage()) {
                result = s;
            }
        }
        return result;
    }

    private Map<Integer,Double> formMap(String subjectName) {
        Map<Integer,Double> result = new HashMap<>();
        System.out.println();
        System.out.println("Map physics:");
        try {
            for (Student s : students) {
                result.put(s.getId(), s.getGradeSubject(subjectName));
            }
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
