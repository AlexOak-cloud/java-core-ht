package HomeTask10Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Integer> happyList = new HashMap<>();

        happyList.put("Иванов", 1);
        happyList.put("Петров", 2);
        happyList.put("Петичкин", 3);
        happyList.put("Бэгинс", 4);
        happyList.put("Волк", 5);
        happyList.put("Лис", 6);
        happyList.put("Лев", 7);
        happyList.put("Прва", 8);
        happyList.put("Судак", 9);
        happyList.put("Тудак", 10);
        HomeTask10Util.showMapStringInteger(happyList);
        fixedHappyList(happyList);
        System.out.println();
        System.out.println("Исправленный список :");
        HomeTask10Util.showMapStringInteger(happyList);


    }

    public static void fixedHappyList(Map<String, Integer> localMap) {
        Iterator iterator = localMap.values().iterator();
        while (iterator.hasNext()) {
            int happyBirthday = (int) iterator.next();
            if (happyBirthday > 6 && happyBirthday < 10) {
                iterator.remove();
            }
        }
    }
}
