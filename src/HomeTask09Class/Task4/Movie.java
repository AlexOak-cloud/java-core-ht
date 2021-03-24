package HomeTask09Class.Task4;

public class Movie {
    private String title;
    private String desc;
    private int year;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        this.desc = "";
    }

    public Movie(String title, String desc, int year) {
        this.title = title;
        this.desc = desc;
        this.year = year;
    }
}
