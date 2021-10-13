package Lab1.Task11;

public abstract class AbstractPerson {
    private String firstName;
    private String LastName;
    private double age;
    public AbstractPerson(final String firstName, final String lastName, final double age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    protected AbstractPerson() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(final String lastName) {
        LastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(final double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }


}
