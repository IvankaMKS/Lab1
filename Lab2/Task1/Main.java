package Lab2.Task1;

public class Main {
    public static void main(String[] args) {
        Learner learner1 = new Learner("Sofia", "Bila", "7-A");
        Learner learner2 = new Learner("Lida", "Vantyh", "10-B");

        Teacher teacher1 = new Teacher("Sergiy ", "Onuskiv", "'Geometry'");
        Teacher teacher2 = new Teacher("Oksana ", "Dzala", "'Biology'");
        System.out.println();


        learner1.PIB();
        learner2.PIB();
        System.out.println();

        teacher1.PIB();
        teacher2.PIB();
    }
}