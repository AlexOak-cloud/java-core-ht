package HomeTask09Class.Task1;

public class Developer extends Employee {

    public Developer(String name, String email, int  experience) {
        super(name, email, experience);
    }

    private String mainLanguauge;
    private String[] skills;

    public Developer(String name, String email, int experience, String mainLanguauge, String[] skills) {
        super(name, email, experience);
        this.mainLanguauge = mainLanguauge;
        this.skills = skills;
    }

    public String getMainLanguauge() {
        return mainLanguauge;
    }

    public String[] getSkills() {
        return skills;
    }

    public String toString(){
        return getName() + "\nEmail: " + getEmail() + "\nExperience: " + getExperience() +
                "\nMain Language: " + getMainLanguauge() ;
    }
}
