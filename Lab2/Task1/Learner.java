package Lab2.Task1;

public class Learner extends Person {
    private String Class;

    public String getClassLearner() {
        return Class;
    }

    public Learner(String name, String surname, String Class) {
        super(name, surname);
        this.Class = Class;
    }

    static {
        System.out.println("Learner static");
    }

    @Override
    public void PIB() {
        System.out.println("Learner " + getName() +" " + getSurname() + ", " + "Class: " + getClassLearner() );
    }
}
