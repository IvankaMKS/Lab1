package Lab2.Task1;

public class Teacher extends Person {
    private String TypeOfDiscipline;

    public Teacher(String name, String surname, String TypeOfDiscipline) {
        super(name, surname);
        this.TypeOfDiscipline = TypeOfDiscipline;
    }
    static
    {
        System.out.println("Teacher static");
    }

    @Override
    public void PIB() {
        System.out.println("Teacher " + getName() + " " + getSurname() + ", " + "Teaches:" + " " + TypeOfDiscipline);
    }


}
