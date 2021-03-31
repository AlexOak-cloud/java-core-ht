package HomeTask10Collections;

//Нужно создать множество строк (Set<String>) и занестив него 20 слов на букву «Л»

import java.util.HashSet;
import java.util.Set;


public class Task1 {
    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        setString.add("Лимур");
        setString.add("Локкей");
        setString.add("Лобстер");
        setString.add("Локоматив");
        setString.add("Лямбда");
        setString.add("Лесопилка");
        setString.add("Леопард");
        setString.add("Лесополоса");
        setString.add("Лунтик");
        setString.add("Лето");
        setString.add("Лего");
        setString.add("LinkedList");
        setString.add("Лимон");

        HomeTask10Util.showSetString(setString);
    }

}
