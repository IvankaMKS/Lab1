package Lab1.Task11;

public class Driver {
    private String ID;
    private String name;

    public Driver(String ID) {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Driver(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n"+"Driver: " +
                "driver ID: " + ID + '\'' +
                ", name: " + name + '\'' +
                '.';
    }
}