package HomeTask09Class.Task1;

public class Start {
    public static void main(String[] args) {
        String[] skills = {"Git", "Scala", "SpringMVS", "SpringSecurity", "Hibernate"};
        Developer developer = new Developer("Александр", "dubovec995@gmail.com",
                2, "Java", skills);

        System.out.println(developer.toString() + "\nSkills: " + showStringArray(skills));
        System.out.println();
        System.out.println();
        System.out.println();


        String[] mlMethods = {"neural network", "decsison tree", "bayesian algorithms"};
        DataAnalyst dataAnalyst = new DataAnalyst("Петр", "petya2001@gmail.com", 1,
                false, mlMethods);

        System.out.println(dataAnalyst.toString() + "\nMethods: " + showStringArray(mlMethods));


    }


    public static String showStringArray(String[] arrayName) {
        String returning = "";
        for (String local : arrayName) {
            returning += local + ", ";
        }
        return returning;
    }
}
