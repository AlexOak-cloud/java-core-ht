package HomeTask10Collections;

// Задача: создать словарь типа
// «фамилия»-«зарплата»и удалить из него тех, у когозарплата ниже 500 кредитов.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Григорий", 200);
        map.put("Вадим", 300);
        map.put("Вячеслав", 400);
        map.put("Арсений", 500);
        map.put("Станислав", 600);
        map.put("Павел", 700);
        HomeTask10Util.showMapStringInteger(map);
        fixedMap(map);
        System.out.println("Исправиленный список :");
        HomeTask10Util.showMapStringInteger(map);

    }

    private static void fixedMap(Map<String, Integer> localMap) {
        Iterator iterator = localMap.values().iterator();
        while (iterator.hasNext()) {
            int values = (int) iterator.next();
            if (values < 500) {
                iterator.remove();
            }
        }
    }
}
