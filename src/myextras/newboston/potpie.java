package myextras.newboston;

public class potpie {
    private int month;
    private int day;
    private int year;

    public potpie(int m, int d, int y) {
        month = m;
        day = d;
        year =y;

        System.out.printf("The comstructor for this is %s\n", this);
    }
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
