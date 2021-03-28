package HomeTask09Class.Task1;

public class DataAnalyst extends Employee {
    public DataAnalyst(String name, String email, int experience) {
        super(name, email, experience);
    }

    private boolean phd;
    private String[] methods;

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public String toString() {
        return getName() + "\nEmail: " + getEmail() + "\nExperience: " + getExperience() +
                "\nPhD: " + isPhd();

    }
}
