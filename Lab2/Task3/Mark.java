package Lab2.Task3;

public class Mark {
    private int mark;

    public int getRating() {
        return mark;
    }

    public void setRating(int mark) {
        this.mark = mark;
    }

    public Mark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return
                "mark=" + mark +
                '}';
    }
}
