package Lab2.Task4;

public class Main {
    public static void main(String[] args) {
        final StudentList studentList = new StudentList(new String[]{"Physics", "Math", "English"});
        final Student student1 = new Student("418", "Ivanna Maksymiv");
        final Student student2 = new Student("664", "Olga Halyan");
        final Student student3 = new Student("775", "Sofia Kis");

        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);

        studentList.setMark("Physics", "418", 5);
        studentList.setMark("Physics", "664", 3);
        studentList.setMark("Physics", "775", 5);
        studentList.setMark("Math", "418", 4);
        studentList.setMark("Math", "664", 3);
        studentList.setMark("Math", "775", 3);
        studentList.setMark("English", "418", 4);
        studentList.setMark("English", "664", 5);
        studentList.setMark("English", "775", 4);

        studentList.addSubject("History");
        studentList.setMark("History", "418", 5);
        studentList.setMark("History", "664", 5);
        studentList.setMark("History", "775", 5);

        System.out.println("Data on all students: ");
        studentList.AllStudents();
        System.out.println();

        System.out.println("The student with the highest score: ");
        studentList.getBestStudent();
        System.out.println();

        System.out.println("Map physics: ");
        System.out.println(studentList.getMarks("Physics"));

    }
}