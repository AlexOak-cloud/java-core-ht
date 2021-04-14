package HomeTask10Collections;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Map<String, String> peopleList = new HashMap<>();

        peopleList.put("Мэтью", "Макконохи");
        peopleList.put("Киану", "Ривз");
        peopleList.put("Джеки", "Чан");
        peopleList.put("Брюс", "Ли");
        peopleList.put("Майк", "Тайсон");
        peopleList.put("Джет", "Ли");
        peopleList.put("НеКиану", "Ривз");

        HomeTask10Util.showMapStringString(peopleList);
        System.out.println();
        System.out.println();
        Map<String,String> fixedMap = deleteForName(peopleList);
        HomeTask10Util.showMapStringString(fixedMap);


    }
    public static Map<String, String> deleteForName(Map<String, String> localMap) {
        Map<String, String> newMap = new HashMap<>();
        for (Map.Entry<String, String> temporary : localMap.entrySet()) {
            String key = temporary.getKey();
            String value = temporary.getValue();
            if (!newMap.containsValue(value)) {
                newMap.put(key, value);
            } else {
                continue;
            }
        }
        return newMap;
    }
}