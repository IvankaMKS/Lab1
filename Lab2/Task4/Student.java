package Lab2.Task4;
import java.util.List;

public class Student {
    private final int id;
    private String name;
    private String surname;
    private double averageGrade;
    private List<Subject> subjects;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surname) {
        this.surname = surname;
    }

    public Student(String name,String surname, List<Subject> subjects, int id) {
        this.name = name;
        this.surname = surname;
        this.subjects = subjects;
        this.id = id;
        getGradeAverage();
    }

    public boolean addSubject(Subject subject) {
        if (subject == null) {
            return false;
        }
        if (subjects.contains(subject)) {
            return false;
        }
        subjects.add(subject);
        getGradeAverage();
        return true;
    }

    public Double getGradeAverage() {
        double sum = 0;

        for (Subject s : subjects) {
            sum += s.getGrade();
        }
        averageGrade = sum / subjects.size();

        return averageGrade;
    }

    public Double getGradeSubject(String subjName) throws IllegalArgumentException {
        if (subjName == null) {
            System.out.println("subject can`t be null!");;
        }
        for (Subject s : subjects) {
            if (s.getName().equals(subjName)) {
                return s.getGrade();
            }
        }
        return null;
    }

    public boolean setGradeSubject(String subjName, double grade) {
        if (subjName == null) {
            return false;
        }
        for (Subject s : subjects) {
            if (s.getName().equals(subjName)) {
                s.setGrade(grade);
                getGradeAverage();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        System.out.println();
        result.append(name).append(" ").append(surname).append(": ").append("Average grade: ").append(averageGrade).append(System.lineSeparator());
        for (Subject s : subjects) {
            result.append(s.getName()).append(": ").append(s.getGrade()).append(" ") ;
        }
        return result.toString();
    }
}